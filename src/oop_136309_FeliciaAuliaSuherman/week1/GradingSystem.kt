package oop_136309_FeliciaAuliaSuherman.week1

fun calculateStatus(score: Int) = if(score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name: String = "Felicia"
    val score: Int = 85

    println("Nama: " + name + ", Nilai: " + score)

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

