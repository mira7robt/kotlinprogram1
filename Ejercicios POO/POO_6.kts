open class Vehiculo {
    open fun describir() {
        println("Este es un vehículo genérico.")
    }
}

class Coche : Vehiculo() {
    override fun describir() {
        super.describir()
        println("Más específicamente, un coche de 4 ruedas.")
    }
}

fun main() {
    val miCoche = Coche()
    println("--- Descripción del Coche ---")
    miCoche.describir()
}
