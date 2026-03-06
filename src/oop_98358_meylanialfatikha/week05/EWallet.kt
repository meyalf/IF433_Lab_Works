package oop_98358_meylanialfatikha.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran EWallet Rp$amount berhasil! Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Saldo tidak cukup! Saldo: Rp$balance, Butuh: Rp$amount")
        }
    }

    // Fungsi spesifik hanya milik EWallet
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up Rp$amount berhasil! Saldo sekarang: Rp$balance")
    }
}