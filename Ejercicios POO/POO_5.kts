abstract class Animal(val nombre: String) {
    abstract fun hacerSonido()
    abstract fun moverse()
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Guau! ¡Guau!")
    }

    override fun moverse() {
        println("$nombre está corriendo por el parque.")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Miau!")
    }

    override fun moverse() {
        println("$nombre camina sigilosamente.")
    }
}

class Pajaro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Pío, pío!")
    }

    override fun moverse() {
        println("$nombre está volando alto.")
    }
}

fun main() {
    val fido = Perro("Fido")
    val michi = Gato("Michi")
    val piolin = Pajaro("Piolín")

    val animales: List<Animal> = listOf(fido, michi, piolin)

    println("--- Comportamiento de los animales ---")
    for (animal in animales) {
        animal.hacerSonido()
        animal.moverse()
        println("--------------------")
    }
}
