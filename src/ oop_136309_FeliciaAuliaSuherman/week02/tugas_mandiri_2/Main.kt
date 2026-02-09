package ` oop_136309_FeliciaAuliaSuherman`.week02.tugas_mandiri_2

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)

    print("What's your name? ")
    val name: String = scanner.nextLine()

    print("How many HP you want? ")
    var hp: Int = scanner.nextInt()

    print("How many of the damages? ")
    val damage: Int = scanner.nextInt()

    print("What's enemy's name?")
    val enemyName: String = scanner.nextLine()

    var enemyHp = 100
    var hero = Hero(name, hp, damage)

    while (hero.isAlive() && enemyHp > 0) {
        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()
        if (choice == 1) {
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("$enemyName terkena serangan! Sisa HP $enemyName: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("$enemyName membalas! Hero terkena $enemyDamage damage")
                println("Sisa HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Hero $name kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL ===")
    if (hero.isAlive() && enemyHp <= 0 || enemyHp < hp) {
        println("Hero ${hero.name} menang dari pertarung!")
    } else if (!hero.isAlive() && enemyHp > 0 || enemyHp > hp) {
        println("$enemyName menang dari pertarung!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}