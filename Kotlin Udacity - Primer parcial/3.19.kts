import kotlin.random.Random

val rollDice: (Int) -> Int = { numSides ->
    if (numSides == 0) {
        0
    } else {
        Random.nextInt(1, numSides + 1)
    }
}

val rollDice2: (Int) -> Int = rollDice

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}

fun main() {
    println(rollDice(6))
    println(rollDice(12))
    println(rollDice(0))
    println(rollDice2(8))

    gamePlay(rollDice2(6))
    gamePlay(rollDice2(10))
}