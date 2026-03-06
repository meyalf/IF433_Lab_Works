package oop_98358_meylanialfatikha.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Credit Card Rp$amount berhasil! Terpakai: Rp$usedAmount dari limit Rp$limit")
        } else {
            println("[$accountName] Transaksi ditolak! Limit tidak cukup. Terpakai: Rp$usedAmount, Limit: Rp$limit")
        }
    }
}