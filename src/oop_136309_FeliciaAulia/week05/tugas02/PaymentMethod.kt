package oop_136309_FeliciaAulia.week05.tugas02

abstract class PaymentMethod(val accountName : String) {
    abstract fun processPayment(amount : Double)
}