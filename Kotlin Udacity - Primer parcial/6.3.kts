enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)

    val north: () -> Unit = { path.add(Directions.NORTH) }
    val south: () -> Unit = { path.add(Directions.SOUTH) }
    val east: () -> Unit = { path.add(Directions.EAST) }
    val west: () -> Unit = { path.add(Directions.WEST) }

    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }
}

fun main() {
    val game = Game()
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println(game.path)
}