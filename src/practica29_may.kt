// Kotlin Practice: Null Safety, Lists & Arrays

fun main() {
// Exercise 1: Optional User Details
    var userName: String?
    var userEmail: String?
    var userBio: String?

    userName = "Robert Miranda"
    userEmail = null
    userBio = ""

    if (userName == null){
        println("Name is not provided")
    }else{
        println("Name is: $userName ")
    }

    if (userEmail == null){
        println("Email is not provided")
    }else{
        println("Email is: $userEmail")
    }

    if (userBio == null){
        println("Bio is not provided")
    }else{
        println("Bio is: $userBio")
    }

//   Exercise 2: Simple To-Do List
    val todoList = mutableListOf<String>()

    todoList.add("Comprar un nuevo procesador")
    todoList.add("Subir practicas a github")
    todoList.add("Completar leccion 2 de Kotlin")

    println("To-Do List")
    if (todoList == null){
        println("No task")
    } else {
        println(todoList)
    }

// Exercise 3: Item Prices 💰
    val itemNames: Array<String> = arrayOf("Maquina espresso", "Cafe", "Leche", "Almendras")
    val itemPrices: Array<Double?> = arrayOf(399.99, 85.50, null, 22.00)
}

fun printItemDetails(index: Int, names: Array<String>, prices: Array<Double>) {
    if (index in names.indices){
        val name = names[index]
        val price = prices[index]

        if (price == null){
            println("Item: $name, Price: $$price")
        } else {
            println("Item: $name, Price: Not available")
        }
    } else {
        println("Invalid item index.")
    }
}

// Exercise 4: Default Configuration Values ⚙️
fun