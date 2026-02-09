package ` oop_136309_FeliciaAuliaSuherman`.week02.tugas_mandiri

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("Masukkan Judul: ")
    val bookTitle: String = scanner.nextLine()

    print("Masukkan Peminjam: ")
    val borrower: String = scanner.nextLine()

    print("Masukkan Durasi Peminjaman: ")
    val loanDuration: Int = scanner.nextInt()

    if (loanDuration < 1) {
        val loanDuration: Int = 1
    }

    val l1 = Loan(bookTitle, borrower, loanDuration)
    println("Detail Peminjaman:")
    println ("-----------------")
    println("Judul: ${l1.bookTitle}")
    println("Peminjaman: ${l1.borrower}")
    println("Durasi: ${l1.loanDuration}")
    println("Denda: ${l1.calculateFine(loanDuration)}")
}