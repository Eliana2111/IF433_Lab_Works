package oop_136309_FeliciaAulia.week03

class Weapon(val name: String, damage: Int) {

    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
                return
            }
            if (value > 1000) {
                println("Damage terlalu besar! Di-set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() = if (damage > 800) {
            "Legendary"
        } else if (damage > 500) {
            "Epic"
        } else {
            "Common"
        }
}