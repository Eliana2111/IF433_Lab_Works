package oop_136309_FeliciaAulia.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){ // maaf kak honkny sebelumny typo hehe
        println("Beep Beep")
    }
}