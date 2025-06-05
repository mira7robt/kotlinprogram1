open class Libro(val titulo: String, val autor: String) {
    private var paginaActual: Int = 0

    open fun leerPagina() {
        paginaActual++
    }
}

class LibroDigital(titulo: String, autor: String, val formato: String = "texto") : Libro(titulo, autor) {
    private var palabrasLeidas: Int = 0

    override fun leerPagina() {
        palabrasLeidas += 250
    }
}