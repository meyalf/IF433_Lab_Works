package oop_98358_meylanialfatikha.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Silakan beristirahat.")
        }
        is BattleState.MonsterEncounter -> {
            println("BAHAYA! Monster ${event.monsterName} muncul! Bersiap bertarung!")
        }
        is BattleState.LootDropped -> {
            println("Item ditemukan: ${event.item.name}")
            println("Damage: ${event.item.damage}, Rarity: ${event.item.rarity}")
        }
        is BattleState.GameOver -> {
            println("GAME OVER! Alasan: ${event.reason}")
        }
    }
}