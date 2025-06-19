open class Publicacion(val titulo: String, val autor: String)

class Libro(
    titulo: String,
    autor: String,
    val numeroPaginas: Int
) : Publicacion(titulo, autor)

class ArticuloDeRevista(
    titulo: String,
    autor: String,
    val nombreRevista: String
) : Publicacion(titulo, autor)

fun main() {
    val miLibro = Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1178)
    val miArticulo = ArticuloDeRevista(
        "El Futuro de Kotlin",
        "Ana García",
        "Revista de Programación Moderna"
    )

    println("--- Detalles de la Publicación ---")

    println("\nLibro:")
    println("Título: ${miLibro.titulo}")
    println("Autor: ${miLibro.autor}")
    println("Número de Páginas: ${miLibro.numeroPaginas}")

    println("\nArtículo de Revista:")
    println("Título: ${miArticulo.titulo}")
    println("Autor: ${miArticulo.autor}")
    println("Nombre de la Revista: ${miArticulo.nombreRevista}")
}
