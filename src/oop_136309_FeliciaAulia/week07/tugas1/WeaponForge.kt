package oop_136309_FeliciaAulia.week07.tugas1

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword() : Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem,50)
        }
        fun forgeEpicSword() : Weapon {
            val epicItem = GameItem("Pedang Naga Kuno", 100, ItemRarity.EPIC)
            return Weapon(epicItem,200)
        }
    }
}