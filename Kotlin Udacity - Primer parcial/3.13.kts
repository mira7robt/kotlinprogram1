fun main() {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("tired", "rainy", 15))
    println(whatShouldIDoToday("excited", temperature = 30))
    println(whatShouldIDoToday("bored", "cloudy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad" && weather == "rainy" -> "Listen to some calming music"
        mood == "tired" && temperature < 20 -> "Curl up with a good book"
        mood == "excited" && weather == "sunny" && temperature > 25 -> "Go for a run"
        mood == "bored" && weather == "cloudy" -> "Try a new recipe"
        else -> "Stay home and read."
    }
}