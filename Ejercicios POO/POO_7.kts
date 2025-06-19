abstract class Animal(val nombre: String)

class Perro(nombre: String) : Animal(nombre)

class Gato(nombre: String) : Animal(nombre)

class Pajaro(nombre: String) : Animal(nombre)

fun describirComportamiento(animal: Animal) {
    when (animal) {
        is Pajaro -> {
            println("Este animal vuela alto.")
        }
        is Perro -> {
            println("Este animal es el mejor amigo del hombre.")
        }
        else -> {
            println("Este animal tiene un comportamiento interesante.")
        }
    }
}

fun main() {
    val fido = Perro("Fido")
    val michi = Gato("Michi")
    val piolin = Pajaro("Piolín")

    println("--- Describiendo comportamientos específicos ---")
    describirComportamiento(piolin)
    describirComportamiento(fido)
    describirComportamiento(michi)
}
