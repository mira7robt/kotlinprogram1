//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Practice using types
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1
    println(b2)

    val i4: Int = b2.toInt()
    println(i4)

    val i23: String = b2.toString()
    println(i23)

    val i6: Double = b2.toDouble()
    println(i6)

    var fish = 4
    println(fish)
    val aquarium = 1
    println(aquarium)

    val numberOfFish = 5
    val numberOfPlants = 25
    println("yo tengo $numberOfFish pescados" + " y $numberOfPlants plantas")
        if (numberOfFish > numberOfPlants) {
            println("buena proporcion!")
        } else {
            println("Una proporcion no saludable")
        }
    if (fish in 1..100){
        println(fish)
    }
    if (numberOfFish == 0){
        println("tanque vacio")
    } else if (numberOfFish < 40) {
        println("Tienes pescados!")
    } else {
        println("Tienes muchos pescados!")
    }

    when (numberOfFish) {
        0 -> println("Tanque vacio")
        in 1..39 -> println("Tienes pescados")
        else -> println("Eso son muchos pescados")
    }
}


