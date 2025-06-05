fun List<Int>.filterDivisibleBy(predicate: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (predicate(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val divisibleBy3 = numbers.filterDivisibleBy { number -> number % 3 }

    println(divisibleBy3) // Output: [3, 6, 9, 0]
}