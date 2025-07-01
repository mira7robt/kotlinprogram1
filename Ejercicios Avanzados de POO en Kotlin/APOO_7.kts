interface Impresora {
    fun imprimir(documento: String)
}

interface Escaner {
    fun escanear(): String
}

class ImpresoraLaser : Impresora {
    override fun imprimir(documento: String) {
        println("Imprimiendo (Láser): $documento")
    }
}

class EscanerDeCamaPlana : Escaner {
    override fun escanear(): String {
        return "Texto escaneado desde cama plana."
    }
}

class Multifuncional(
    impresora: Impresora,
    escaner: Escaner
) : Impresora by impresora, Escaner by escaner

fun main() {
    val miMultifuncional = Multifuncional(ImpresoraLaser(), EscanerDeCamaPlana())
    
    miMultifuncional.imprimir("Mi reporte final.")
    val texto = miMultifuncional.escanear()
    println("Resultado del escaneo: $texto")
}