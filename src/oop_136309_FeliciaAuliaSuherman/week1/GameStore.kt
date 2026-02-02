package oop_136309_FeliciaAuliaSuherman.week1

fun main () {
   val gameTitle: String = "Valorant"
   val price: Int = 450000

    printReceipt(title = gameTitle, price = price)
}

fun calculateDiscount(price: Int){
      if(price < 500000) {
         println("Price: ${price - (price * 0.1)}")
   }  else {
         println("Price: ${price - (price * 0.2)}")
   }
}

fun printReceipt(title: String, userNote: String? = null, price: Int) {

    println("Game Title: $title")
    println("Price: $price")
    calculateDiscount(price)
    println("User Note: ${userNote ?: "Tidak ada catatan"}")
}