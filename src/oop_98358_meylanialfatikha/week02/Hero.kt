package oop_98358_meylanialfatikha.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100  // Default HP = 100
) {

    // Method untuk menyerang
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Method untuk menerima damage
    fun takeDamage(damage: Int) {
        hp -= damage

        // Pastikan HP tidak minus
        if (hp < 0) {
            hp = 0
        }
    }

    // Method untuk cek apakah masih hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}