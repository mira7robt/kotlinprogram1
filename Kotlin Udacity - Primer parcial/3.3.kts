import java.util.Calendar

fun main() {
    println("Hola desde main!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    // Obtener la instancia del calendario
    val calendar = Calendar.getInstance()

    // Obtener el día de la semana (DOMINGO = 1, LUNES = 2, ..., SÁBADO = 7)
    val day = calendar.get(Calendar.DAY_OF_WEEK)

    // Usar una sentencia 'when' para imprimir el nombre del día
    when (day) {
        Calendar.SUNDAY -> println("Today is Sunday.")
        Calendar.MONDAY -> println("Today is Monday.")
        Calendar.TUESDAY -> println("Today is Tuesday.")
        Calendar.WEDNESDAY -> println("Today is Wednesday.")
        Calendar.THURSDAY -> println("Today is Thursday.")
        Calendar.FRIDAY -> println("Today is Friday.")
        Calendar.SATURDAY -> println("Today is Saturday.")
        else -> println("I don't know what day it is.") // En caso de un valor inesperado
    }
}
