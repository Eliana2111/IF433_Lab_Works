package oop_136309_FeliciaAulia.week04

class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand){

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}