object Logger {
    private val logs = mutableListOf<String>()

    fun log(mensaje: String) {
        logs.add(mensaje)
        println("LOG: $mensaje")
    }

    fun mostrarLogs() {
        println("\n--- Historial de Logs ---")
        logs.forEach { println(it) }
    }
}

fun main() {
    println("Iniciando proceso...")
    Logger.log("Primer mensaje de log.")
    println("Realizando una tarea...")
    Logger.log("Segundo mensaje, desde otra parte.")
    Logger.mostrarLogs()
}