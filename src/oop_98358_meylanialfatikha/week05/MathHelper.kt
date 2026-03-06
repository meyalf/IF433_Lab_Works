package oop_98358_meylanialfatikha.week05

class MathHelper {

    // Overloading 1: Luas Persegi (1 parameter Int)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Overloading 2: Luas Persegi Panjang (2 parameter Int)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Overloading 3: Luas Lingkaran (1 parameter Double)
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}