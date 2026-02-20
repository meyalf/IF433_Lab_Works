package oop_98358_meylanialfatikha.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    e.printStatus()

    println("Pajak yang harus dibayar: ${e.tax}")

    println()

    println("========== TEST WEAPON ==========")
    val sword = Weapon("Dragon Sword")

    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}")

    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}")
    println("Tier: ${sword.tier}")

    sword.damage = 700
    println("Tier damage 700: ${sword.tier}")

    sword.damage = 300
    println("Tier damage 300: ${sword.tier}")

    println()

    println("========== TEST PLAYER ==========")
    val player = Player("Andi")


    player.addXp(50)
    println("Level saat ini: ${player.level}")

    player.addXp(60)
    println("Level saat ini: ${player.level}")

    player.addXp(-10)
    player.addXp(200)
    println("Level saat ini: ${player.level}")
}