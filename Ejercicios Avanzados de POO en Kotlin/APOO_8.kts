fun obtenerCoordenadas(): Pair<Int, Int> {
    return Pair(10, 25)
}

fun obtenerDatosUsuario(): Triple<String, Int, Boolean> {
    return Triple("alex", 30, true)
}

fun main() {
    val (x, y) = obtenerCoordenadas()
    println("Coordenadas: X=$x, Y=$y")

    val (nombre, edad, estaActivo) = obtenerDatosUsuario()
    println("Usuario: $nombre, Edad: $edad, Activo: $estaActivo")
}