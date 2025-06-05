import java.util.Random

fun whatShouldIDoToday(mood: String, weather: String, temperature: Int): String {
    fun isSadRainyCold() = mood == "sad" && weather == "rainy" && temperature == 0
    fun isHot() = temperature > 35
    fun isHappySunny() = mood == "happy" && weather == "sunny"
    fun isBored() = mood == "bored"
    fun isTired() = mood == "tired"
    fun isAdventurousRainyWarm() = mood == "adventurous" && weather == "rainy" && temperature > 10

    return when {
        isSadRainyCold() -> "stay in bed"
        isHot() -> "go swimming"
        isHappySunny() -> "go for a walk"
        isBored() -> "read a book"
        isTired() -> "take a nap"
        isAdventurousRainyWarm() -> "splash in puddles"
        else -> "Stay home and code."
    }
}

fun main() {
    println("What is your mood today?")
    val mood = readLine() ?: "neutral"
    println(whatShouldIDoToday(mood, "sunny", 24))

    repeat(10) {
        println("Your fortune is: ${getFortuneCookie()}")
    }

    var fortune: String
    do {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
    } while (!fortune.contains("Take it easy"))
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "You will discover a new talent.",
        "Expect the unexpected.",
        "Good things come to those who wait.",
        "A pleasant surprise awaits you.",
        "Don't be afraid to take risks.",
        "Embrace new opportunities.",
        "The best is yet to come.",
        "Take it easy."
    )
    return fortunes[Random().nextInt(fortunes.size)]
}