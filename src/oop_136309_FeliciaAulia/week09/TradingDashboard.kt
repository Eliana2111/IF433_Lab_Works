package oop_136309_FeliciaAulia.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -3.8, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 7.2, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 15, -6.4, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 8, 4.9, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 12, -1.7, "CLOSED")
    )

    println("\n=== HOF: FILTER ===")
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }


    val topPerformersString =closedTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: + ${it.roe}% ROE (Lev: ${it.leverage}x)" }
}