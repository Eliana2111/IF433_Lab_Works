package oop_136309_FeliciaAulia.week05.tugas01

fun main(){
    val calculate = MathHelper()

    val luasPersegi = calculate.hitungLuas(5)
    println("Luas Persegi dengan sisi 5cm : $luasPersegi cm")

    val luasPersegiPanjang = calculate.hitungLuas(10, 1)
    println("Luas Persegi Panjang (p=10cm, l=15cm) : $luasPersegiPanjang cm")

    val luasLingkaran = calculate.hitungLuas(14.0)
    println("Luas Lingkaran dengan jari-jari 14.0cm : $luasLingkaran cm")
}