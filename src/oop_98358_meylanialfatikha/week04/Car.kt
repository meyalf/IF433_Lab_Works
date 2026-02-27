package oop_98358_meylanialfatikha.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    // super.accelerate() memanggil logika milik Parent dulu
    // lalu tambahkan logika baru milik Car
    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}