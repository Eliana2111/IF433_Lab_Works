package ` oop_136309_FeliciaAuliaSuherman`.week02.tugas_mandiri_2

class Hero (val name: String, var hp: Int, val baseDamage: Int) {
    constructor(name: String, baseDamage: Int) : this(name, hp = 100, baseDamage)
    fun attack(targetName: String) {
        println("$name memberikan serangan terhadap $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp <= 0) {
            hp = 0
        }
    }

    fun isAive() : Boolean {
        return if (hp > 0) true
        else false
    }
}