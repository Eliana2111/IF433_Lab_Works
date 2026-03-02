package oop_136309_FeliciaAulia.week05.tugas02

class EWallet(var balance: Double) : PaymentMethod("EWallet") {
    override fun processPayment(amount : Double) {
        if (balance > amount) {
            balance -= amount
            println("Pembayaran berhasil sebesar $amount. Sisa saldo: $balance")
        }
        else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil sebesar $amount. Saldo sekarang: $balance")
    }
}