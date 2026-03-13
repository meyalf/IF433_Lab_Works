package oop_98358_meylanialfatikha.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Lampu menyala.")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan.")
    }
}