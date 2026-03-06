package oop_98358_meylanialfatikha.week05

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    // WAJIB di-override karena fungsi bekerja() bersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    //Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("$nama mengajar mahasiswa di kelas.")
    }
}