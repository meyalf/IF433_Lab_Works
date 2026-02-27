package oop_98358_meylanialfatikha.week04

// ElectricCar "Is-A" Car, Car "Is-A" Vehicle
class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    // final = class turunan ElectricCar tidak bisa override lagi
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}