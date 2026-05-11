package oop_136309_FeliciaAulia.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "Porsi kibble haris lebih dari 0 gr"
    }

    if (isJammed){
        throw FeederExceptions.DispenserJamException()
    }

    return availableGram - requestedGram
}