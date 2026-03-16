package oop_136309_FeliciaAulia.week07.tugas1

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata awal pemain:")
    println("Nama Item: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    val upgradeWeapon = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradeWeapon))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}