package oop_98358_meylanialfatikha.week06

class Smartphone : Camera, Phone {
    // Manually override untuk resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn()  // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}