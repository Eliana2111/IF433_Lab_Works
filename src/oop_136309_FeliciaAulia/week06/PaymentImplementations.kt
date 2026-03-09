package oop_136309_FeliciaAulia.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double)  {
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double)  {
        println("Connecting Bank for Rp$amount")
    }
}