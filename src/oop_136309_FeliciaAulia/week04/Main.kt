package oop_136309_FeliciaAulia.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val eCar = ElectricCar("Wuling", 5, 98)
    eCar.accelerate()
    eCar.honk()
    eCar.openTrunk()
}