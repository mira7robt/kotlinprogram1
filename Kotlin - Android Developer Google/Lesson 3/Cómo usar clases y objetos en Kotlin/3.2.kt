package example.myapp

// Step 2: Create a class with properties
class Aquarium {
    var width: Int = 20
    var height: = 40
    var length: = 100
}

//  Step 3: Create a main() function
fun buildAquarium() {
    val myAquarium = Aquarium()
}

fun main() {
    buildAquarium()
}

// Step 4: Add a method
fun printSize() {
    println("Width: $width cm " +
            "Lenght: $lenght cm " +
            "Height: $height cm ")
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}


