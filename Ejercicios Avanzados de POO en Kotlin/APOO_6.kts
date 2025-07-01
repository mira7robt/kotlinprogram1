fun Int.esPar(): Boolean {
    return this % 2 == 0
}

fun Int.cuadrado(): Int {
    return this * this
}

fun main() {
    val num1 = 7
    val num2 = 10

    println("$num1 es par? ${num1.esPar()}")
    println("El cuadrado de $num2 es ${num2.cuadrado()}")
}