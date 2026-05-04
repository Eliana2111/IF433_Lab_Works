package oop_136309_FeliciaAulia.week11

fun main(){
    println("=== TEST EXTENTION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}