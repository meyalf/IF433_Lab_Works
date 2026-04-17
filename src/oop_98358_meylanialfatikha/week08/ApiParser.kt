package oop_98358_meylanialfatikha.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // requireNotNull akan throw IllegalArgumentException jika null
        // as? String → safe cast, jika bukan String hasilnya null
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val id: String = when (product) {
            is Electronic -> {
                println("Memproses Electronic: ${product.name} (Warranty: ${product.warrantyMonths} bulan)")
                product.id
            }
            is Clothing -> {
                println("Memproses Clothing: ${product.name} (Size: ${product.size})")
                product.id
            }
        }

        val rawResult: String? = JavaPaymentService.processPayment(id)
        val transactionId: String = rawResult!!
        println("Transaction ID: $transactionId\n")
    }
}