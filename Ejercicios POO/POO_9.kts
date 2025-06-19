class Usuario(val username: String, val email: String) {

    init {
        if (username.isBlank()) {
            throw IllegalArgumentException("El nombre de usuario no puede estar vacío o solo contener espacios.")
        }
    }

    constructor(username: String) : this(username, "$username@empresa.com") {
        val generatedEmail = "$username@empresa.com"
        if (!generatedEmail.contains("@") || username.contains("@")) {
            throw IllegalArgumentException("El nombre de usuario no puede contener '@' para la generación automática de email.")
        }
    }
}

fun main() {
    println("--- Creando usuarios válidos ---")
    try {
        val user1 = Usuario("ana.lopez", "ana.l@personal.com")
        println("Usuario 1 Creado: ${user1.username}, Email: ${user1.email}")

        val user2 = Usuario("carlos.ruiz")
        println("Usuario 2 Creado: ${user2.username}, Email: ${user2.email}")

    } catch (e: IllegalArgumentException) {
        println("Error inesperado al crear usuarios válidos: ${e.message}")
    }


    println("\n--- Probando casos inválidos ---")
    try {
        val invalidUser1 = Usuario("", "test@test.com")
    } catch (e: IllegalArgumentException) {
        println("Intento 1 fallido: ${e.message}")
    }

    try {
        val invalidUser2 = Usuario("   ")
    } catch (e: IllegalArgumentException) {
        println("Intento 2 fallido: ${e.message}")
    }
}