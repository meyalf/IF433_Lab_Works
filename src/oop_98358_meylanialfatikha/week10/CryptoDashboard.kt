package oop_98358_meylanialfatikha.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.3))
    coinRepo.add(Coin("USDT", 500.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 150.0))
    txRepo.add(Transaction("TX002", 320.5))
    txRepo.add(Transaction("TX003", 75.0))

    println("\n=== TEST TRANSACTION REPOSITORY ===")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}