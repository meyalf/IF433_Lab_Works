package oop_98358_meylanialfatikha.week14

import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi + I/O + Notifikasi sekaligus
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// Fix SRP & DIP: Interface untuk repository
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// Implementasi yang menulis ke CSV menggunakan safe use block
class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File("orders.csv").printWriter().use { writer ->
            writer.println("$itemName,$finalPrice,$customerType")
        }
        println("Order tersimpan ke CSV.")
    }
}

// Fix SRP & DIP: Interface untuk notifikasi
interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// Fix SRP & DIP: Inject kedua abstraksi ke constructor
class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

// Fix OCP: Interface untuk kalkulasi harga
interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}

fun main() {
    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()
    val processor = SafeOrderProcessor(repo, notifier)

    val vipPricing = VipPricing()
    val regularPricing = RegularPricing()

    processor.processOrder("Laptop", vipPricing.calculate(10000.0), "VIP")
    processor.processOrder("Mouse", regularPricing.calculate(500.0), "REGULAR")
}