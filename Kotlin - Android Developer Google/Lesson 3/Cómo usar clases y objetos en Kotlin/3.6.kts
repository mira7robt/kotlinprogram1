package example.myapp

//Step 1. Create an abstract class
abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish() {
    override val color = "grey"
}

class  Plecostomus : AquariumFish() {
    override val color = "gold"
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun main () {
    makeFish()
}

//Step 2. Create an interface
interface FishAction {
    fun eat()
}

class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

abstract class  AquariumFish : FishAction, FishAction {
    abstract val color: String
    override fun eat() =  println("yum")
}