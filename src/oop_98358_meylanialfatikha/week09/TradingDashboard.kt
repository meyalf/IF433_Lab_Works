package oop_98358_meylanialfatikha.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10,  -4.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  15,   8.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  25,  22.1, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT",  5,  -1.8, "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  20,   3.7, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 10,  -2.1, "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}