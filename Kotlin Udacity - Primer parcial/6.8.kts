import kotlin.math.absoluteValue

class Game {
    private var playerLocation = Location(0, 0)
    private val map = Array(4) { arrayOfNulls<String>(4) }

    init {
        map[0][0] = "Estas en una cueva oscura."
        map[0][1] = "Hay un rio subterraneo."
        map[0][2] = "Un gran salon con ecos."
        map[0][3] = "Un pasadizo estrecho."
        map[1][0] = "Un area rocosa y resbaladiza."
        map[1][1] = "En el centro de la cueva."
        map[1][2] = "Un lugar con formaciones extrañas."
        map[1][3] = "Hay una pequeña cascada."
        map[2][0] = "Un tunel que parece no tener fin."
        map[2][1] = "Un nido de criaturas."
        map[2][2] = "Una camara con cristales brillantes."
        map[2][3] = "Un callejon sin salida."
        map[3][0] = "Un lugar con mucha humedad."
        map[3][1] = "Un laberinto de rocas."
        map[3][2] = "Una grieta en la pared."
        map[3][3] = "El final de la cueva, hay una salida."
    }

    fun move(where: () -> Unit) {
        where()
        updateLocation()
    }

    fun makeMove(input: String?) {
        when (input) {
            "n" -> move { playerLocation.y = (playerLocation.y - 1).absoluteValue % 4 }
            "s" -> move { playerLocation.y = (playerLocation.y + 1).absoluteValue % 4 }
            "e" -> move { playerLocation.x = (playerLocation.x + 1).absoluteValue % 4 }
            "w" -> move { playerLocation.x = (playerLocation.x - 1).absoluteValue % 4 }
            else -> move { println("Movimiento invalido.") }
        }
    }

    private fun updateLocation() {
        println(map[playerLocation.x][playerLocation.y])
    }
}

class Location(var x: Int, var y: Int)

fun main() {
    val game = Game()
    while (true) {
        print("Introduce una direccion: n/s/e/w: ")
        game.makeMove(readLine())
    }
}#!/usr/bin/env kotlin

