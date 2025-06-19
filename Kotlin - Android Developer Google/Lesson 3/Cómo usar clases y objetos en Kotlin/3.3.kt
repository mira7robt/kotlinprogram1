//Step 1: Create a constructor

Class Aquarium(leght: Int = 100, width: Int = 20, height: = 40) {
    // Dimensiones en cm
    var length: Int = length
    var width: Int = width
    var height: Int = height
}

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 335, lenfth = 110)
    aquarium4.printSize()
}

// Step 2: Add init blocks
Class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
}

// Step 3: Learn about secondary constructors
contructor(numberOfFish: Int) : this() {
    // 2,000 cm^3 per fish + extra room so water doesn't spill
    val tank = numberOfFish * 2000 * 1.1
}
  // Calculate the height needed
    //height = (tank / (length * width)).toInt()
  fun builAquarium() {
      val aquarium6 = Aquarium(numberOfFish = 29)
      aquarium6.printSize()
      println("Volume: ${aquarium6width * aquarium6.length * aquarium6.height / 1000} liters")
  }
 val volume: Int
     get() = width * height * length / 1000 //1000 cm^3 = liter
fun printSize() {
    println("Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm " +
    )
    // 1 liter = 1000 cm^3
    println("Volume: $volume liters")
}

// Step 5: Add a property setter
var volume: Int
    get() = width * height * length / 1000
    set(value) {
        height = (value *1000) / (width * length)
    }

fun  buildAquarium() {
    val aquarium6 = Aquariumk(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}

