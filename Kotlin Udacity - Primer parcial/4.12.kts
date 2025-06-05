data class ContenedorEspecia(val especias: Especia) {
    val etiqueta = especias.nombre
}

fun main() {
    val curry = Curry("Curry en polvo", "medio")
    val contenedorCurry = ContenedorEspecia(curry)

    println("La etiqueta del contenedor es: ${contenedorCurry.etiqueta}")
}