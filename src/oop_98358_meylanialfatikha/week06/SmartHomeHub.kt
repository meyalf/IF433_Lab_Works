package oop_98358_meylanialfatikha.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' ditambahkan ke Hub.")
    }

    // Checkpoint 17: matikan semua perangkat Switchable
    fun turnOffAllSwitches() {
        println("\n--- Mematikan semua perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    // Checkpoint 18: aktifkan mode keamanan
    fun activateSecurityMode() {
        println("\n--- Mode Keamanan Aktif ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}