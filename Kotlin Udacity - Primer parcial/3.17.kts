fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(curries)

    val cAndE1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(cAndE1)

    val cAndE2 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    println(cAndE2)

    val firstThreeC = spices.take(3).filter { it.startsWith('c') }
    println(firstThreeC)
}