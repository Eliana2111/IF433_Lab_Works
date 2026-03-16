package oop_136309_FeliciaAulia.week07.tugas1

object GameManager  {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning){
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
            return
        }

        isGameRunning = true
        println("Memulai Game Engine...")
    }
}