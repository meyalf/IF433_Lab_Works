package oop_98358_meylanialfatikha.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    // ===== TEST MATHHELPER =====
    println("\n=== TEST MATHHELPER ===")
    val math = MathHelper()

    println("Luas Persegi (sisi=5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (4x6): ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran (jari-jari=7.0): ${math.hitungLuas(7.0)}")
}