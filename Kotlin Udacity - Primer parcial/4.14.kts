enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

sealed class Spice(val name: String, val spiciness: String) {
    class Curry(name: String, spiciness: String, val color: Color = Color.YELLOW) :
        Spice(name, spiciness), Grinder {
        override fun grind() {
            println("Moliendo curry")
        }
    }

    class Pepper(name: String, spiciness: String) : Spice(name, spiciness)
}

interface Grinder {
    fun grind()
}

object YellowSpiceColor {
    val color = Color.YELLOW
}
