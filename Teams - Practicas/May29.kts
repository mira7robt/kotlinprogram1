// Kotlin Practice: Null Safety, Lists & Arrays (Basic Level - Challenge Mode)

fun main() {
    println("--- Ejercicio 1: Detalles Opcionales del Usuario ---")
    ejercicio1()
    println("\n--- Ejercicio 2: Lista Simple de Tareas Pendientes ---")
    ejercicio2()
    println("\n--- Ejercicio 3: Precios de Artículos ---")
    ejercicio3()
    println("\n--- Ejercicio 4: Valores de Configuración por Defecto ---")
    ejercicio4()
    println("\n--- Ejercicio 5: Suma de Puntuaciones Nulas ---")
    ejercicio5()
}

fun ejercicio1() {
    val userName: String? = "Ana García"
    val userEmail: String? = null
    val userBio: String? = ""

    println("Detalles del Usuario:")
    println("Nombre: ${userName ?: "[No proporcionado]"}")
    println("Email: ${userEmail ?: "[No disponible]"}")

    val bioOutput = userBio?.takeIf { it.isNotBlank() } ?: "[El usuario no tiene bio o está vacía]"
    println("Bio: $bioOutput")

    val userBioTest2: String? = null
    print("Bio (alternativa para null): ")
    when {
        userBioTest2 == null -> println("[El usuario no tiene bio]")
        userBioTest2.isEmpty() -> println("[El usuario no tiene bio o está vacía]")
        else -> println(userBioTest2)
    }
    val userBioTest3: String? = "Una bio interesante."
    print("Bio (alternativa para no-null, no-vacío): ")
    when {
        userBioTest3 == null -> println("[El usuario no tiene bio]")
        userBioTest3.isEmpty() -> println("[El usuario no tiene bio o está vacía]")
        else -> println(userBioTest3)
    }
}

fun ejercicio2() {
    val toDoList: MutableList<String?> = mutableListOf()

    toDoList.add("Comprar leche")
    toDoList.add(null)
    toDoList.add("Pagar facturas")
    toDoList.add("Hacer ejercicio")

    println("Lista de Tareas Pendientes:")
    for (task in toDoList) {
        println(task ?: "[Sin descripción de tarea]")
    }

    println("\nPrimera Tarea:")
    if (toDoList.isEmpty()) {
        println("No hay tareas en la lista.")
    } else {
        val firstTask = toDoList.firstOrNull()
        println("Primera tarea: ${firstTask ?: "[Sin descripción de tarea]"}")
    }

    val emptyToDoList: MutableList<String?> = mutableListOf()
    println("\nPrimera Tarea (lista vacía):")
    if (emptyToDoList.isEmpty()) {
        println("No hay tareas en la lista.")
    } else {
        println("Primera tarea: ${emptyToDoList.firstOrNull() ?: "[Sin descripción de tarea]"}")
    }
}

fun ejercicio3() {
    val itemNames: Array<String> = arrayOf("Manzana", "Plátano", "Naranja", "Leche")
    val itemPrices: Array<Double?> = arrayOf(0.5, 0.3, null, 1.2)

    val itemIndex = 2
    val itemIndexValid = 0
    val itemIndexInvalid = 5

    fun printItemDetails(index: Int) {
        println("\nDetalles para el artículo en el índice $index:")
        if (index >= 0 && index < itemNames.size) {
            val name = itemNames[index]
            val price = itemPrices[index]
            println("Artículo: $name, Precio: ${price?.toString()?.let { "\$$it" } ?: "No disponible"}")
        } else {
            println("Índice de artículo inválido.")
        }
    }

    printItemDetails(itemIndex)
    printItemDetails(itemIndexValid)
    printItemDetails(itemIndexInvalid)
}

fun ejercicio4() {
    var settingColorTheme: String? = null
    var settingFontSize: Int? = 20

    settingColorTheme = null
    settingFontSize = null
    println("Caso 1 (ambas nulas):")
    applyAndPrintSettings(settingColorTheme, settingFontSize)

    settingColorTheme = null
    settingFontSize = 16
    println("\nCaso 2 (tema nulo):")
    applyAndPrintSettings(settingColorTheme, settingFontSize)

    settingColorTheme = "Oscuro"
    settingFontSize = null
    println("\nCaso 3 (fuente nula):")
    applyAndPrintSettings(settingColorTheme, settingFontSize)

    settingColorTheme = "Sepia"
    settingFontSize = 14
    println("\nCaso 4 (ninguna nula):")
    applyAndPrintSettings(settingColorTheme, settingFontSize)
}

fun applyAndPrintSettings(settingColorTheme: String?, settingFontSize: Int?) {
    val actualColorTheme: String = settingColorTheme ?: "Light"
    val actualFontSize: Int = settingFontSize ?: 12
    println("Aplicando tema: $actualColorTheme, Tamaño de fuente: ${actualFontSize}pt.")
}

fun ejercicio5() {
    val scores: List<Int?> = listOf(100, 85, null, 92, 70, null, 88)
    var sum = 0

    println("Registro de Puntuaciones:")
    for (score in scores) {
        if (score != null) {
            println("Puntuación registrada: $score")
            sum += score
        } else {
            println("Intento fallido.")
        }
    }

    println("Puntuación total de intentos registrados: $sum")

    val nonNullScores: List<Int> = scores.filterNotNull()
    println("\nLista de puntuaciones no nulas: $nonNullScores")
}