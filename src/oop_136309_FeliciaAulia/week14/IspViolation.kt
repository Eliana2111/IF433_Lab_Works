package oop_136309_FeliciaAulia.week14

interface MultifuntionDevice {
    fun print(doc: String)
    fun scan(doc: String): String
    fun fax(doc: String)
}

class SimplePrinter : MultifuntionDevice {
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException ("No scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException ("No fax")
}