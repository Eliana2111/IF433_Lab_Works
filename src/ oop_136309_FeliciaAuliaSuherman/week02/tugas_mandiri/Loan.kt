package ` oop_136309_FeliciaAuliaSuherman`.week02.tugas_mandiri

class Loan (val bookTitle: String, val borrower: String, var loanDuration: Int = 1) {
    fun calculateFine(loanDuration: Int) : Int {
        if (loanDuration > 3){
            return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
}