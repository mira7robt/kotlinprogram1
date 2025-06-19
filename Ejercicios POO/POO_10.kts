open class Notificacion {
    open fun enviar() {
        println("Enviando notificación genérica...")
    }
}

class NotificacionEmail(val destinatario: String, val asunto: String) : Notificacion() {
    override fun enviar() {
        println("Enviando email a '$destinatario' con asunto '$asunto'.")
    }
}

class NotificacionSMS(val numero: String) : Notificacion() {
    override fun enviar() {
        println("Enviando SMS al número $numero.")
    }
}

class NotificacionPush(val idDispositivo: String) : Notificacion() {
    override fun enviar() {
        println("Enviando notificación push al dispositivo $idDispositivo.")
    }
}

fun enviarTodas(notificaciones: List<Notificacion>) {
    for (notificacion in notificaciones) {
        notificacion.enviar()
    }
}

fun main() {
    val email = NotificacionEmail("usuario@ejemplo.com", "Actualización Importante")
    val sms = NotificacionSMS("+1234567890")
    val push = NotificacionPush("ID-Dispositivo-ABC-123")

    val listaDeNotificaciones: List<Notificacion> = listOf(email, sms, push)

    println("--- Iniciando el envío de todas las notificaciones ---")
    enviarTodas(listaDeNotificaciones)
    println("--- Envío completado ---")
}
