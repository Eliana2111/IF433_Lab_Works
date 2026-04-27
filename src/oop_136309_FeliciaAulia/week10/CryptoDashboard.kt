package oop_136309_FeliciaAulia.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 2.50))
    coinRepo.add(Coin("USDT", 1500.0))
}