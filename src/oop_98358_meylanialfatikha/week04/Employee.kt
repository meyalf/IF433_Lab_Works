package oop_98358_meylanialfatikha.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return baseSalary / 10  // 10% dari baseSalary
    }
}