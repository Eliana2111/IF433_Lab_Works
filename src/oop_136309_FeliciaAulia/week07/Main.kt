package oop_136309_FeliciaAulia.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // di commit sebelumnya lupa di perbaiki tapi commit ini udh di perbaiki kok ka maap hehe
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val req1 = RegularUser("Alice", 22)
    val req2 = RegularUser("Alice", 22)
    println(req1)
    println("Sama? ${req1 == req2}")
}