package oop_136309_FeliciaAulia.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu pintar $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu pintar $name dimatikan.")
    }
}