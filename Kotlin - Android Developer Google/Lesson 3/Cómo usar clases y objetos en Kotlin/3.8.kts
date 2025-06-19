// Step 1: Create a data class
package example.myapp.decor

class Decoration {
}

data class Decoration(val rocks: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)
}

println (decoration1.equals(decoration2))
println (decoration3.equals(decoration2))

//Step 2. Use destructuring

val rock = decoration.rock
val wood = decoration.wood
val diver = decoration.diver

val (rock, wood, diver) = decoration


data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

val (rock, _, diver) = d5