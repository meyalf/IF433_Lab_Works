package oop_98358_meylanialfatikha.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar dari Parent + 500000
        return super.calculateBonus() + 500000
    }
}