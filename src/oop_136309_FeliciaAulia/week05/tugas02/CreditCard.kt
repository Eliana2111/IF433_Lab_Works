package oop_136309_FeliciaAulia.week05.tugas02

class CreditCard(val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod("Credit Card") {
    override fun processPayment(amount : Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi berhasil sebesar $amount.")
            println("Sisa limit: ${limit - usedAmount}")
        }
        else {
            println("Transaksi ditolak. Limit tidak mencukupi.")
        }
    }
}