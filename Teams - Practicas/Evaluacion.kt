fun main() {
    var calificacion = 76
    if (calificacion in 90..100){
        println("A")
    } else if (calificacion in 80..89){
        println("B")
    } else if (calificacion in 70..79){
        println("C")
    } else if (calificacion in 60..69){
        println("D")
    } else {
        println("F")
    }
}
