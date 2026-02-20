package oop_98358_meylanialfatikha.week03

fun main() {
    // ========== TEST EMPLOYEE ==========
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    e.printStatus()

    println("Pajak yang harus dibayar: ${e.tax}")

    println()

    // ========== TEST WEAPON ==========
    println("========== TEST WEAPON ==========")
    val sword = Weapon("Dragon Sword")

    sword.damage = -50   // Harus ditolak, nilai tetap 0
    println("Damage setelah set -50: ${sword.damage}")

    sword.damage = 9999  // Harus jadi 1000
    println("Damage setelah set 9999: ${sword.damage}")
    println("Tier: ${sword.tier}")  // Legendary

    sword.damage = 700
    println("Tier damage 700: ${sword.tier}")  // Epic

    sword.damage = 300
    println("Tier damage 300: ${sword.tier}")  // Common
}
