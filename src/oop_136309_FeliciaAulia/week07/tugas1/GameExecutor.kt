package oop_136309_FeliciaAulia.week07.tugas1

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> println("Player sedang berada di Safe Zone. Aman untuk beristirahat.")
        is BattleState.LootDropped -> println("Mendapat loot: ${event.item.name} (Rarity: ${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        is BattleState.MonsterEncounter -> println("Monster muncul: ${event.monsterName}")
    }
}