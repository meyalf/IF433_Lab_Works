package oop_98358_meylanialfatikha.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()