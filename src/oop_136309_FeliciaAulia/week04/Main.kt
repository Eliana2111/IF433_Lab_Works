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

    println("\n--- Testing Employee ---")
    val m = Manager("Feli", 12000000)
    val dev = Developer("Richard", 15000000, "C")
    m.work()
    println("Bonus: ${m.calculateBonus()}")
    dev.work()
    println("Bonus: ${dev.calculateBonus()}")
}