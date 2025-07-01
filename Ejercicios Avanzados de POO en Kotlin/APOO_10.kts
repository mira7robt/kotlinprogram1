sealed class ElementoSistema(val nombre: String)
class Archivo(nombre: String, val tamañoKB: Int) : ElementoSistema(nombre)
class Directorio(nombre: String, val contenidos: MutableList<ElementoSistema> = mutableListOf()) : ElementoSistema(nombre)

object GestorArchivos {
    fun crearArchivo(nombre: String, tamaño: Int): Archivo {
        return Archivo(nombre, tamaño)
    }
    fun crearDirectorio(nombre: String): Directorio {
        return Directorio(nombre)
    }
}

fun Directorio.calcularTamañoTotal(): Int {
    var tamañoTotal = 0
    for (elemento in contenidos) {
        tamañoTotal += when (elemento) {
            is Archivo -> elemento.tamañoKB
            is Directorio -> elemento.calcularTamañoTotal()
        }
    }
    return tamañoTotal
}

fun main() {
    val raiz = GestorArchivos.crearDirectorio("raiz")
    val documentos = GestorArchivos.crearDirectorio("documentos")
    val fotos = GestorArchivos.crearDirectorio("fotos")

    documentos.contenidos.add(GestorArchivos.crearArchivo("reporte.docx", 250))
    fotos.contenidos.add(GestorArchivos.crearArchivo("vacaciones.jpg", 1200))
    fotos.contenidos.add(GestorArchivos.crearArchivo("familia.png", 850))
    
    raiz.contenidos.add(documentos)
    raiz.contenidos.add(fotos)
    raiz.contenidos.add(GestorArchivos.crearArchivo("temporal.tmp", 10))

    println("El tamaño total del directorio '${raiz.nombre}' es: ${raiz.calcularTamañoTotal()} KB")
}