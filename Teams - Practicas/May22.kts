// Ejercicios Básicos de Kotlin: Variables y Condiciones

fun main() {
    println("--- Ejercicio 1: Verificador Simple de Edad ---")
    ejercicio1()
    println("\n--- Ejercicio 2: Evaluador de Calificaciones ---")
    ejercicio2()
    println("\n--- Ejercicio 3: Simulador de Semáforo ---")
    ejercicio3()
    println("\n--- Ejercicio 4: ¿Par o Impar? ---")
    ejercicio4()
    println("\n--- Ejercicio 5: Intento de Inicio de Sesión ---")
    ejercicio5()
    println("\n--- Ejercicio 6: Guía de Temperatura ---")
    ejercicio6()
    println("\n--- Ejercicio 7: Saludo con Nombre Nulable ---")
    ejercicio7()
}

// Ejercicio 1: Verificador Simple de Edad 👶👴
fun ejercicio1() {
    var edadPersona: Int
    edadPersona = 15
    println("Edad inicial: $edadPersona")

    if (edadPersona < 18) {
        println("Resultado: Menor")
    } else {
        println("Resultado: Adulto")
    }

    edadPersona = 25
    println("Nueva edad: $edadPersona")
    if (edadPersona < 18) {
        println("Resultado: Menor")
    } else {
        println("Resultado: Adulto")
    }
}

// Ejercicio 2: Evaluador de Calificaciones 🎓
fun ejercicio2() {
    val calificacionNumerica: Int = 85
    println("Calificación numérica: $calificacionNumerica")

    val calificacionLiteral: String
    if (calificacionNumerica >= 90 && calificacionNumerica <= 100) {
        calificacionLiteral = "A"
    } else if (calificacionNumerica >= 80 && calificacionNumerica <= 89) {
        calificacionLiteral = "B"
    } else if (calificacionNumerica >= 70 && calificacionNumerica <= 79) {
        calificacionLiteral = "C"
    } else if (calificacionNumerica >= 60 && calificacionNumerica <= 69) {
        calificacionLiteral = "D"
    } else if (calificacionNumerica < 60 && calificacionNumerica >= 0) {
        calificacionLiteral = "F"
    } else {
        calificacionLiteral = "Calificación inválida"
    }
    println("Calificación literal: $calificacionLiteral")

    val otraCalificacion: Int = 55
    println("Otra calificación numérica: $otraCalificacion")
    val otraCalificacionLiteral: String
    if (otraCalificacion >= 90 && otraCalificacion <= 100) {
        otraCalificacionLiteral = "A"
    } else if (otraCalificacion >= 80 && otraCalificacion <= 89) {
        otraCalificacionLiteral = "B"
    } else if (otraCalificacion >= 70 && otraCalificacion <= 79) {
        otraCalificacionLiteral = "C"
    } else if (otraCalificacion >= 60 && otraCalificacion <= 69) {
        otraCalificacionLiteral = "D"
    } else if (otraCalificacion < 60 && otraCalificacion >= 0) {
        otraCalificacionLiteral = "F"
    } else {
        otraCalificacionLiteral = "Calificación inválida"
    }
    println("Otra calificación literal: $otraCalificacionLiteral")
}

// Ejercicio 3: Simulador de Semáforo 🚦
fun ejercicio3() {
    var colorSemaforo: String = "Amarillo"
    println("Color actual del semáforo: $colorSemaforo")

    when (colorSemaforo) {
        "Rojo" -> println("Acción: Detenerse")
        "Amarillo" -> println("Acción: Precaución")
        "Verde" -> println("Acción: Avanzar")
        else -> println("Acción: Color de semáforo inválido")
    }

    colorSemaforo = "Verde"
    println("Nuevo color del semáforo: $colorSemaforo")
    when (colorSemaforo) {
        "Rojo" -> println("Acción: Detenerse")
        "Amarillo" -> println("Acción: Precaución")
        "Verde" -> println("Acción: Avanzar")
        else -> println("Acción: Color de semáforo inválido")
    }

    colorSemaforo = "Azul"
    println("Nuevo color del semáforo: $colorSemaforo")
    when (colorSemaforo) {
        "Rojo" -> println("Acción: Detenerse")
        "Amarillo" -> println("Acción: Precaución")
        "Verde" -> println("Acción: Avanzar")
        else -> println("Acción: Color de semáforo inválido")
    }
}

// Ejercicio 4: ¿Par o Impar? 🤔
fun ejercicio4() {
    val numero: Int = 27
    println("Número: $numero")

    if (numero % 2 == 0) {
        println("El número es Par.")
    } else {
        println("El número es Impar.")
    }

    val otroNumero: Int = 100
    println("Otro número: $otroNumero")
    if (otroNumero % 2 == 0) {
        println("El número es Par.")
    } else {
        println("El número es Impar.")
    }
}

// Ejercicio 5: Intento de Inicio de Sesión 🔑
fun ejercicio5() {
    val savedUsername = "usuarioKotlin"
    val savedPassword = "password123"

    var enteredUsername_intento1 = "usuarioKotlin"
    var enteredPassword_intento1 = "password123"
    println("Intento 1 - Usuario: $enteredUsername_intento1, Contraseña: $enteredPassword_intento1")

    if (enteredUsername_intento1 == savedUsername) {
        if (enteredPassword_intento1 == savedPassword) {
            println("Resultado: Inicio de Sesión Exitoso")
        } else {
            println("Resultado: Contraseña Incorrecta")
        }
    } else {
        println("Resultado: Nombre de Usuario Incorrecto")
    }

    var enteredUsername_intento2 = "usuarioKotlin"
    var enteredPassword_intento2 = "claveErronea"
    println("Intento 2 - Usuario: $enteredUsername_intento2, Contraseña: $enteredPassword_intento2")

    if (enteredUsername_intento2 == savedUsername) {
        if (enteredPassword_intento2 == savedPassword) {
            println("Resultado: Inicio de Sesión Exitoso")
        } else {
            println("Resultado: Contraseña Incorrecta")
        }
    } else {
        println("Resultado: Nombre de Usuario Incorrecto")
    }

    var enteredUsername_intento3 = "usuarioInvalido"
    var enteredPassword_intento3 = "password123"
    println("Intento 3 - Usuario: $enteredUsername_intento3, Contraseña: $enteredPassword_intento3")

    if (enteredUsername_intento3 == savedUsername) {
        if (enteredPassword_intento3 == savedPassword) {
            println("Resultado: Inicio de Sesión Exitoso")
        } else {
            println("Resultado: Contraseña Incorrecta")
        }
    } else {
        println("Resultado: Nombre de Usuario Incorrecto")
    }
}

// Ejercicio 6: Guía de Temperatura 🌡️
fun ejercicio6() {
    val temperaturaActualCelsius: Int = 15
    println("Temperatura actual: $temperaturaActualCelsius°C")

    when {
        temperaturaActualCelsius < 0 -> println("Consejo: ¡Congelante! Usa ropa muy abrigada.")
        temperaturaActualCelsius in 0..10 -> println("Consejo: Frío. Usa una chaqueta abrigada.")
        temperaturaActualCelsius in 11..20 -> println("Consejo: Fresco. Una chaqueta ligera debería ser suficiente.")
        temperaturaActualCelsius in 21..30 -> println("Consejo: Cálido. ¡Disfruta el clima!")
        temperaturaActualCelsius > 30 -> println("Consejo: ¡Caliente! Mantente hidratado.")
        else -> println("Consejo: Temperatura fuera del rango típico.")
    }

    val otraTemperatura: Int = -5
    println("Otra temperatura: $otraTemperatura°C")
    when {
        otraTemperatura < 0 -> println("Consejo: ¡Congelante! Usa ropa muy abrigada.")
        otraTemperatura in 0..10 -> println("Consejo: Frío. Usa una chaqueta abrigada.")
        otraTemperatura in 11..20 -> println("Consejo: Fresco. Una chaqueta ligera debería ser suficiente.")
        otraTemperatura in 21..30 -> println("Consejo: Cálido. ¡Disfruta el clima!")
        otraTemperatura > 30 -> println("Consejo: ¡Caliente! Mantente hidratado.")
        else -> println("Consejo: Temperatura fuera del rango típico.")
    }

    val temperaturaExtrema: Int = 50
    println("Temperatura extrema: $temperaturaExtrema°C")
    when {
        temperaturaExtrema < 0 -> println("Consejo: ¡Congelante! Usa ropa muy abrigada.")
        temperaturaExtrema in 0..10 -> println("Consejo: Frío. Usa una chaqueta abrigada.")
        temperaturaExtrema in 11..20 -> println("Consejo: Fresco. Una chaqueta ligera debería ser suficiente.")
        temperaturaExtrema in 21..30 -> println("Consejo: Cálido. ¡Disfruta el clima!")
        temperaturaExtrema > 30 -> println("Consejo: ¡Caliente! Mantente hidratado.")
        else -> println("Consejo: Temperatura fuera del rango típico.")
    }
}

// Ejercicio 7: Saludo con Nombre Nulable 👋
fun ejercicio7() {
    var userName: String?
    userName = "Alice"
    println("userName actual: $userName")

    if (userName != null) {
        println("Saludo: ¡Hola, $userName!")
    } else {
        println("Saludo: ¡Hola, Invitado!")
    }

    userName = null
    println("userName actual: $userName")
    if (userName != null) {
        println("Saludo: ¡Hola, $userName!")
    } else {
        println("Saludo: ¡Hola, Invitado!")
    }
}
