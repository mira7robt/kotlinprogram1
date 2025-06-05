fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1 // Default to 1 if input is invalid
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go your way.",
        "Today is a good day to learn something new.",
        "Expect the unexpected.",
        "Take it easy and enjoy the day.",
        "A pleasant surprise awaits you.",
        "Your hard work will pay off."
    )

    return when (birthday) {
        28, 31 -> "You're destined for greatness!"
        in 1..7 -> "The first week of the month brings good tidings."
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}