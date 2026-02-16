package oop_136309_FeliciaAulia.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar ${e.tax}")
} // karena ga bisa commit sama kyk sebelumnya