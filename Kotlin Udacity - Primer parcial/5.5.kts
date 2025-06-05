fun main() {
    val allBooks = setOf("Hamlet", "Romeo y Julieta", "Macbeth")

    val library = mapOf("William Shakespeare" to allBooks)

    val hasHamlet = library.any { it.value.contains("Hamlet") }
    println(hasHamlet)

    val moreBooks = mutableMapOf("El Quijote" to "Miguel de Cervantes")
    println(moreBooks)

    moreBooks.getOrPut("Otelo") { "William Shakespeare" }
    println(moreBooks)
}