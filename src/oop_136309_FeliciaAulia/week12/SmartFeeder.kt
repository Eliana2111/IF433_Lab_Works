package oop_136309_FeliciaAulia.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "Porsi kibble haris lebih dari 0 gr"
    }

    if (isJammed){
        throw FeederExceptions.DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FeederExceptions.FoodEmptyException(
            requested = requestedGram,
            available = availableGram,
        )
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try {
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: FeederExceptions.DispenserJamException) {
        println(e.message)
    } catch (e: FeederExceptions.FoodEmptyException) {
        println(e.message)
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    }
}