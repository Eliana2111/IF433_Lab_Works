package oop_136309_FeliciaAulia.week05.tugas02

fun main() {
    val ewallet = EWallet(50000.0)
    val cc = CreditCard(100000.0)
    val paymentMethod: List<PaymentMethod> = listOf(ewallet, cc)

    for (method in paymentMethod) {
        println("=== Pembayaran menggunakan ${method.accountName} ===")
        method.processPayment(75000.0)
        if (method is EWallet) {
            println("Saldo kurang, program akan otomatis melakukan top up.")
            method.topUp(50000.0)

            println("Mencoba ulang transaksi.")
            method.processPayment(75000.0)
        }
        println()
    }
}