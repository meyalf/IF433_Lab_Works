package oop_98358_meylanialfatikha.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PEMINJAMAN BUKU PERPUSTAKAAN ===")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    // Validasi: Lama pinjam tidak boleh minus
    if (loanDuration < 0) {
        println("PERINGATAN: Lama pinjam tidak boleh minus! Diubah menjadi 1 hari.")
        loanDuration = 1
    }

    // Buat objek Loan
    val loan = Loan(bookTitle, borrower, loanDuration)

    // Hitung denda
    val fine = loan.calculateFine()

    // Tampilkan detail peminjaman
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp $fine")

    if (fine == 0) {
        println("Selamat! Tidak ada denda.")
    } else {
        println("Anda terlambat ${loan.loanDuration - 3} hari. Harap bayar denda.")
    }
}