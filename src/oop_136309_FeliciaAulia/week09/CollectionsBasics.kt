package oop_136309_FeliciaAulia.week09

fun main(){
    println("=== TEST LIST ===")

    val framework: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $framework")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}