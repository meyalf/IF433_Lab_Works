package oop_98358_meylanialfatikha.week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override
    // otomatis pakai punya Parent (10% dari baseSalary)
}