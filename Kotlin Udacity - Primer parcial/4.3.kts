class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
        get() {
            return field
        }
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                else -> 0
            }
        }
}

fun main() {
    val simpleSpice = SimpleSpice()
    println(simpleSpice.name)
    println(simpleSpice.heat)
}