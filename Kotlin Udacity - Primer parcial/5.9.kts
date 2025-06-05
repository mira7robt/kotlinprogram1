import kotlin.random.Random

const val MAX_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, var pages: Int) {
    fun canBorrow(booksBorrowed: Int): Boolean {
        return booksBorrowed < MAX_BOOKS
    }

    fun printUrl() {
        println("${Constants.BASE_URL}$title.html")
    }

    companion object {
        const val BASE_URL = "https://example.com/books/"
    }
}

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) {
    pages -= torn
    if (pages < 0) pages = 0
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(1, book.pages))
    }
}

fun main() {
    val book = Book("El principito", "Antoine de Saint-Exupéry", 1943, 100)
    val puppy = Puppy()

    println("Peso inicial del libro: ${book.weight()} gramos")

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Páginas restantes: ${book.pages}, Peso actual: ${book.weight()} gramos")
    }

    println("El libro no tiene más páginas.")
}