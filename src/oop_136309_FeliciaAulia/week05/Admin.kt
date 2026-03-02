package oop_136309_FeliciaAulia.week05

class Admin(name: String) : Pegawai(name) {
    override fun bekerja() {
        println("[$name] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("[$name] sedang merekap data absensi mahasiswa.")
    }
}