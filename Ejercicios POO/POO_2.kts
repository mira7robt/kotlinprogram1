import kotlin.math.PI

open class FiguraGeometrica(val nombre: String) {
    fun imprimirNombre() {
        println("Soy una figura: $nombre")
    }

    open fun calcularArea(): Double {
        return 0.0
    }
}

class Circulo(nombre: String, val radio: Double) : FiguraGeometrica(nombre) {
    override fun calcularArea(): Double {
        return PI * radio * radio
    }
}

class Cuadrado(nombre: String, val lado: Double) : FiguraGeometrica(nombre) {
    override fun calcularArea(): Double {
        return lado * lado
    }
}

fun main() {
    val miCirculo = Circulo("Círculo Central", 10.5)
    val miCuadrado = Cuadrado("Cuadrado Principal", 4.0)

    val figuras: List<FiguraGeometrica> = listOf(miCirculo, miCuadrado)

    println("--- Calculando áreas de las figuras (Polimorfismo) ---")
    for (figura in figuras) {
        val area = String.format("%.2f", figura.calcularArea())
        println("El área de '${figura.nombre}' es: $area")
    }
}
