class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book = Book("Cien años de soledad", "Gabriel García Márquez", 1967)

    val (bookTitle, bookAuthor) = book.getTitleAndAuthor()
    val (title, author, year) = book.getTitleAuthorAndYear()

    println("Aquí está tu libro $bookTitle escrito por $bookAuthor en $year.")
}