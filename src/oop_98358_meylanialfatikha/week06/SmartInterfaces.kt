package oop_98358_meylanialfatikha.week06

// Interface 1: Identitas perangkat smart
interface SmartDevice {
    val id: String
    val name: String
}

// Interface 2: Kemampuan dinyalakan/dimatikan
interface Switchable {
    fun turnOn()
    fun turnOff()
}

// Interface 3: Kemampuan merekam
interface Recordable {
    fun startRecord()

    // Default function - sudah ada implementasinya
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}