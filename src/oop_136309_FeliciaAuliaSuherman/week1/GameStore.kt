package oop_136309_FeliciaAuliaSuherman.week1

fun main () {
   val gameTitle: String = "Valorant"
   val price: Int = 450000

    println("Game Title: $gameTitle")
    calculatediscount(price)
}

fun calculatediscount(price: Int){
      if(price < 500000) {
         println("Price: ${price - (price * 0.1)}")
   }  else {
         println("Price: ${price - (price * 0.2)}")
   }
}