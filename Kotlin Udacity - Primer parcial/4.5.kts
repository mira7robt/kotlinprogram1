class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "hot" -> 7
                "flaming" -> 10
                else -> 0
            }
        }

    init {
        println("Creando especia: $name, Picor: $spiciness, Calor: $heat")
    }
}

fun makeSalt() = Spice("salt")

fun main() {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("chili", "hot"),
        makeSalt()
    )

    val lessSpicySpices = spices.filter { it.heat <= 5 }

    println("\nEspecias picantes o menos:")
    lessSpicySpices.forEach {
        println("${it.name} - ${it.spiciness} (${it.heat})")
    }
}