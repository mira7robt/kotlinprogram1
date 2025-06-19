class Producto(val codigo: String, val precio: Double) {

    init {
        if (precio < 0) {
            throw IllegalArgumentException("El precio no puede ser negativo.")
        }
    }

    constructor(codigo: String) : this(codigo, 9.99)

    constructor() : this("GEN-001", 0.99)
}

fun main() {
    println("--- Creando productos con diferentes constructores ---")

    val producto1 = Producto("LAP-123", 1250.50)
    val producto2 = Producto("MOU-456")
    val producto3 = Producto()

    println("\nProducto 1 (Constructor Primario):")
    println("Código: ${producto1.codigo}, Precio: ${producto1.precio}")

    println("\nProducto 2 (Constructor Secundario con código):")
    println("Código: ${producto2.codigo}, Precio: ${producto2.precio}")

    println("\nProducto 3 (Constructor Secundario sin parámetros):")
    println("Código: ${producto3.codigo}, Precio: ${producto3.precio}")

    try {
        println("\nIntentando crear producto con precio negativo...")
        val productoInvalido = Producto("ERR-000", -100.0)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
