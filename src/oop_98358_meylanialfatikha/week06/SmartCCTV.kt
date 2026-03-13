package oop_98358_meylanialfatikha.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] CCTV menyala.")
        startRecord() // Otomatis mulai rekam saat dinyalakan
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan.")
    }

    override fun startRecord() {
        println("[$name] Mulai merekam...")
    }
}