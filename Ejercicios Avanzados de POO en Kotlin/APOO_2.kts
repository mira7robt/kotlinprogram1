sealed class ResultadoAPI {
    data class Exito(val datos: String) : ResultadoAPI()
    data class Error(val mensaje: String) : ResultadoAPI()
    object Cargando : ResultadoAPI()
}

fun procesarResultado(resultado: ResultadoAPI) {
    when (resultado) {
        is ResultadoAPI.Exito -> println("Éxito: ${resultado.datos}")
        is ResultadoAPI.Error -> println("Error: ${resultado.mensaje}")
        ResultadoAPI.Cargando -> println("Cargando...")
    }
}

fun main() {
    procesarResultado(ResultadoAPI.Exito("Datos recibidos correctamente"))
    procesarResultado(ResultadoAPI.Error("No se pudo conectar al servidor"))
    procesarResultado(ResultadoAPI.Cargando)
}