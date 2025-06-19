open class Empleado(val nombre: String, val edad: Int, val salarioBase: Double) {

    init {
        println("Se ha registrado un nuevo empleado: $nombre")
    }

    open fun calcularSalario(): Double {
        return salarioBase
    }
}

class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    val bono: Double
) : Empleado(nombre, edad, salarioBase) {

    override fun calcularSalario(): Double {
        return salarioBase + bono
    }
}

class Desarrollador(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    val lenguaje: String
) : Empleado(nombre, edad, salarioBase)

fun main() {
    val gerente = Gerente("Ana López", 42, 5000.0, 1500.0)
    val desarrollador = Desarrollador("Carlos Ruiz", 28, 3000.0, "Kotlin")

    println("\n--- Calculando Salarios ---")
    println("Salario de ${gerente.nombre} (Gerente): ${gerente.calcularSalario()}")
    println("Salario de ${desarrollador.nombre} (Desarrollador): ${desarrollador.calcularSalario()}")
    println("El desarrollador ${desarrollador.nombre} programa en ${desarrollador.lenguaje}.")
}
