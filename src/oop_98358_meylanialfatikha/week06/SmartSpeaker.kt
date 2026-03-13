package oop_98358_meylanialfatikha.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker menyala.")
    }

    override fun turnOff() {
        println("[$name] Speaker dimatikan.")
    }

    // Fungsi spesifik hanya milik SmartSpeaker
    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}