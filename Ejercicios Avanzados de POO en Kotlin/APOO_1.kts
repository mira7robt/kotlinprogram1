data class Libro(val titulo: String, val autor: String, val isbn: String)

fun main() {
    val libro1 = Libro("El Señor de los Anillos", "J.R.R. Tolkien", "978-0618640157")
    val libro2 = Libro("El Señor de los Anillos", "J.R.R. Tolkien", "978-0618640157")

    println(libro1 == libro2)

    println(libro1)

    val libro3 = libro1.copy(titulo = "La Comunidad del Anillo")
    println(libro3)
}