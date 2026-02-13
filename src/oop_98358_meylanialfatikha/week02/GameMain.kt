package oop_98358_meylanialfatikha.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    // Input Hero
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Damage Hero: ")
    val heroDamage = scanner.nextInt()

    // Buat objek Hero
    val hero = Hero(heroName, heroDamage)

    // Musuh (variabel biasa, bukan objek)
    var enemyHp = 100
    val enemyName = "Goblin"

    println("\n$heroName VS $enemyName - FIGHT!")
    println("HP Hero: ${hero.hp} | HP $enemyName: $enemyHp")

    // Game Loop
    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- GILIRAN ANDA ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang
            hero.attack(enemyName)
            enemyHp -= hero.baseDamage

            // Pastikan HP musuh tidak minus
            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("$enemyName menerima ${hero.baseDamage} damage!")
            println("HP $enemyName tersisa: $enemyHp")

            // Cek apakah musuh mati
            if (enemyHp > 0) {
                // Musuh membalas
                val enemyDamage = (10..20).random()
                println("\n$enemyName membalas serangan!")
                hero.takeDamage(enemyDamage)
                println("${hero.name} menerima $enemyDamage damage!")
                println("HP ${hero.name} tersisa: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("${hero.name} melarikan diri dari pertempuran!")
            break  // Keluar dari loop

        } else {
            println("Pilihan tidak valid!")
        }
    }

    // Umumkan pemenang
    println("\n=== HASIL PERTEMPURAN ===")
    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} MENANG! Selamat!")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH! Game Over.")
    } else {
        println("Pertempuran dibatalkan.")
    }
}