package oop_98358_meylanialfatikha.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1  // Default = 1 hari
) {

    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            // Rumus: (Durasi - 3) * 2000
            (loanDuration - 3) * 2000
        } else {
            0  // Tidak ada denda jika <= 3 hari
        }
    }
}