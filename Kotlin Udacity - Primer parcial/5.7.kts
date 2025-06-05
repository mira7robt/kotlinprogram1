
/// CODGIO INCOMPLETO TERMINAR LAS PARTES COMENTADAS


const val MAX_BOOKS = 5

class Book(val title: String, val author: String, val year: Int) {
    fun canBorrow(booksBorrowed: Int): Boolean {
        return booksBorrowed < MAX_BOOKS
    }

    fun printUrl() {
        println("${Constants.BASE_URL}$title.html")
    }

    companion object {
 //       const val BASE_URL = "URL"
    }
}

object Constants {
// Faltan ???? No se como completar esta parte
}

fun main() {
    val book = Book("El principito", "Antoine de Saint-Exupéry", 1943)
    println(book.canBorrow(3))
    println(book.canBorrow(5))
    book.printUrl()
}