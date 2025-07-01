class Usuario private constructor(val email: String) {
    companion object {
        fun crearDesdeEmail(email: String): Usuario? {
            return if (email.contains("@")) {
                Usuario(email)
            } else {
                null
            }
        }
    }
}

fun main() {
    val usuarioValido = Usuario.crearDesdeEmail("usuario@ejemplo.com")
    val usuarioInvalido = Usuario.crearDesdeEmail("usuario-invalido")

    println("Usuario válido creado: ${usuarioValido?.email}")
    println("Intento con email inválido: $usuarioInvalido")
}