package oop_98358_meylanialfatikha.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}