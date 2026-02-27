package oop_98358_meylanialfatikha.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()   // Method milik Car sendiri
    myCar.honk()        // Method yang sudah di-override
    myCar.accelerate()  // Gabungan method Parent dan Child
}