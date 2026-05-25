package oop_136309_FeliciaAulia.week14

import oop_136309_FeliciaAulia.week12.divide

class MySQLDatabase {
    fun query(sql: String): List<String> =listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase()
    fun getUsers(id: Int) = database.query("SELECT * FROM users WHERE id=$id")
}