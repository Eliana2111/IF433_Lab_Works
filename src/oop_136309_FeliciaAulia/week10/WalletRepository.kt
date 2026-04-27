package oop_136309_FeliciaAulia.week10


class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it is Coin && it.name.contains(keyword, ignoreCase = true)
        }
    }
}