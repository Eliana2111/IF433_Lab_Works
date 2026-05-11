package oop_136309_FeliciaAulia.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "Porsi kibble haris lebih dari 0 gr"
    }

    return availableGram - requestedGram
}