package oop_136309_FeliciaAuliaSuherman.week1

fun main() {
    val radius: Double = 7.0
    val pi: Double = 3.14
    var area: Double = pi * radius * radius

    println("Radius: $radius" +",Area: "+area)
    println(checkSize(area))
}

fun checkSize(area: Double): String {
    return if (area > 100) {
        ("This is a Big Circle")
    } else {
        ("This is a Small Circle")
    }
}