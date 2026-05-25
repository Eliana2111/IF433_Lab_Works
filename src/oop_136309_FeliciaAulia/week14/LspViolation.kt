package oop_136309_FeliciaAulia.week14

open class Rectangle{
    open var width: Int = 0
    open var height: Int = 0
    fun area() = width * height
}

class Square : Rectangle(){
    override var width = 0
        set(value) { field = value; super.height = value }
    override var height = 0
        set(value) { field = value; super.width = value }
}