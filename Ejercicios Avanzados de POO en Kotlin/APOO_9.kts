class Caja<T>(val contenido: T?) {
    fun obtenerContenido(): T? {
        return contenido
    }

    fun estaVacia(): Boolean {
        return contenido == null
    }
}

fun main() {
    val cajaDeString = Caja("Hola Mundo")
    val cajaDeInt = Caja(123)
    val cajaVacia = Caja<Any>(null)

    println("Contenido de cajaDeString: ${cajaDeString.obtenerContenido()}")
    println("cajaDeString está vacía? ${cajaDeString.estaVacia()}")
    
    println("Contenido de cajaDeInt: ${cajaDeInt.obtenerContenido()}")
    println("cajaDeInt está vacía? ${cajaDeInt.estaVacia()}")

    println("Contenido de cajaVacia: ${cajaVacia.obtenerContenido()}")
    println("cajaVacia está vacía? ${cajaVacia.estaVacia()}")
}