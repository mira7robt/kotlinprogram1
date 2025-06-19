open class FiguraGeometrica(val nombre: String) {
    fun imprimirNombre() {
        println("Soy una figura: $nombre")
    }
}

class Circulo(nombre: String, val radio: Double) : FiguraGeometrica(nombre)

class Cuadrado(nombre: String, val lado: Double) : FiguraGeometrica(nombre)

fun main() {
    val miCirculo = Circulo("Círculo Central", 10.5)
    val miCuadrado = Cuadrado("Cuadrado Principal", 4.0)

    println("--- Llamando a los métodos ---")
    miCirculo.imprimirNombre()
    miCuadrado.imprimirNombre()

    println("\n--- Accediendo a propiedades específicas ---")
    println("El radio de ${miCirculo.nombre} es ${miCirculo.radio}")
    println("El lado de ${miCuadrado.nombre} es ${miCuadrado.lado}")
}