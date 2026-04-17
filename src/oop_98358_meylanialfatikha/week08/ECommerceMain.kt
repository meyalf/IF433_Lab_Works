package oop_98358_meylanialfatikha.week08

fun main() {
    println("========================================")
    println("   E-COMMERCE API PARSER PIPELINE")
    println("========================================\n")

    val rawApiData: List<Map<String, Any?>> = listOf(
        // Data normal - Electronic dengan warranty valid
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),

        // Data normal - Clothing dengan size valid
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),

        // Data korup - warranty bukan Int, harusnya fallback ke 12
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),

        // Data korup - tidak ada ID, harusnya throw IllegalArgumentException
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),

        // Data tidak dikenal - type FOOD tidak ada di when, harusnya return null (di-skip)
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            // ?.let → hanya jalan jika product TIDAK null
            product?.let {
                parser.checkout(it)
            } ?: println("SKIP: Tipe produk tidak dikenali → ${raw["id"] ?: "NO_ID"} (${raw["type"]})\n")

        } catch (e: IllegalArgumentException) {
            // Tangkap exception dari requireNotNull
            println("⚠ PERINGATAN - Data korup diabaikan: ${e.message}\n")
        }
    }

    println("========================================")
    println("   PIPELINE SELESAI")
    println("========================================")
}