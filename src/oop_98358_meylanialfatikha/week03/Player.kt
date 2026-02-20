package oop_98358_meylanialfatikha.week03

class Player(val username: String) {

    // Private - tidak bisa diubah langsung dari luar
    private var xp: Int = 0

    // Computed Property - level dihitung dari xp
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("WARNING: XP hanya menerima angka positif!")
            return
        }

        val levelBefore = level
        xp += amount
        println("$username mendapatkan $amount XP! Total XP: $xp")

        // Cek apakah level naik
        if (level > levelBefore) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}