fun leasson2() {
    val totalFish = 2 + 71 + 233 - 13
    println("Remaining fish: $totalFish")
    println("Aquariums needed: ${(totalFish + 29) / 30}") // (totalFish + (fish_per_aquarium - 1)) / fish_per_aquarium for ceiling division

    // Tarea 1: Create a String variable rainbowColor, set its color value, then change it.
    var rainbowColor: String = "Red" // Usamos 'var' para poder cambiar su valor
    println("Initial rainbowColor: $rainbowColor")

    rainbowColor = "Orange" // Cambiamos el valor
    println("Changed rainbowColor: $rainbowColor")

    // Tarea 2: Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
    val blackColor: String = "Black" // Usamos 'val' para una variable de solo lectura
    println("blackColor: $blackColor")

    // Intentamos cambiar blackColor, lo cual resultará en un error de compilación.

    println("Attempted to change blackColor (if uncommented, would be a compile-time error).")

    // 1. Try to set rainbowColor to null.

    var rainbowColor: String? = "Purple" // Declara rainbowColor como String anulable
    println("Initial rainbowColor: $rainbowColor")

    rainbowColor = null // Ahora podemos asignar null
    println("rainbowColor after setting to null: $rainbowColor")

    // Declare two variables, greenColor and blueColor.
    // Use two different ways of setting them to null.

    // Forma 1: Declarar y asignar null directamente
    var greenColor: String? = null
    println("greenColor (assigned null directly): $greenColor")

    // Forma 2: Declarar y luego asignar null (después de una posible inicialización)
    var blueColor: String? = "Sky Blue" // Inicializamos con un valor no nulo
    println("Initial blueColor: $blueColor")
    blueColor = null // Luego asignamos null
    println("blueColor (assigned null later): $blueColor")

    // 1. Create a list with two elements that are null; do it in two different ways.

    // Forma 1: Usando listOf() directamente con nulls
    val listWithNullsWay1: List<String?> = listOf(null, null)
    println("List with nulls (Way 1): $listWithNullsWay1")

    // Forma 2: Creando una lista mutable y añadiendo nulls
    val listWithNullsWay2: MutableList<String?> = mutableListOf()
    listWithNullsWay2.add(null)
    listWithNullsWay2.add(null)
    println("List with nulls (Way 2): $listWithNullsWay2")

    // 2. Next, create a list where the list is null.
    var nullableList: List<String>? = null
    println("Nullable list (initially null): $nullableList")

    // Puedes reasignarle un valor de lista más tarde si lo deseas
    nullableList = listOf("Hello", "World")
    println("Nullable list (after assigning a list): $nullableList")

    nullableList = null // Y puedes volver a ponerla en null
    println("Nullable list (back to null): $nullableList")

    // Create a nullable integer variable called nullTest, and set it to null.
    var nullTest: Int? = null
    val result = nullTest?.inc() ?: 0

    println("Original nullTest value: $nullTest")
    println("Result after null-check and increment: $result")

    // Podemos probarlo con un valor no nulo también para ver la diferencia:
    nullTest = 5
    val resultNotNull = nullTest?.inc() ?: 0
    println("\nOriginal nullTest value (now 5): $nullTest")
    println("Result after null-check and increment: $resultNotNull")

    //2.9

    // --- Tarea 1: Variables de String y plantillas ---

    println("--- Tarea 1 ---")

    val trout = "trucha"
    val haddock = "eglefino"
    val snapper = "pargo"

    println("Me gusta comer $trout.")
    println("No me gusta comer $haddock.")
    println("Normalmente me gusta el $snapper.")

    // --- Tarea 2: Sentencia 'when' ---

    println("\n--- Tarea 2 ---")

    fun checkFishName(fishName: String) {
        when (fishName.length) {
            0 -> println("Error: El nombre del pescado no puede estar vacío.")
            in 3..12 -> println("Buen nombre de pescado: \"$fishName\"")
            else -> println("OK nombre de pescado: \"$fishName\"")
        }
    }

    // Ejemplos de uso para la Tarea 2:
    checkFishName("bacalao") // Longitud 7, en el rango
    checkFishName("")        // Longitud 0
    checkFishName("pez espada") // Longitud 9, en el rango
    checkFishName("salmón rey real gigante del Atlántico") // Longitud > 12
    checkFishName("atun") // Longitud 4, en el rango

    //2.12
    // 1. Crear un array de números enteros llamado 'numbers', del 11 al 15.
    val numbers = arrayOf(11, 12, 13, 14, 15)

    // 2. Crear una lista mutable vacía de Strings.
    val stringList = mutableListOf<String>()

    // 3. Escribir un bucle 'for' que recorra el array y añada la representación en String de cada número a la lista.
    for (number in numbers) {
        stringList.add(number.toString())
    }
    println("Lista de números (String): $stringList") // Output: Lista de números (String): [11, 12, 13, 14, 15]

    val divisibleBySevenList = mutableListOf<Int>()

    for (i in 0..100) {
        if (i % 7 == 0) { // El operador '%' es el módulo. Si el resto de la división por 7 es 0, es divisible.
            divisibleBySevenList.add(i)
        }
    }

    println("Números entre 0 y 100 divisibles por 7: $divisibleBySevenList")

}


