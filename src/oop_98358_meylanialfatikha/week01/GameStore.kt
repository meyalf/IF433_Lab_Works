package oop_98358_meylanialfatikha.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== STRUK STEAMKW ===")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}