package Especias

abstract class Especia(val nombre: String, val picor: String) : ColorEspecia by AmarilloColorEspecia {
    abstract fun prepararEspecia()
}

interface Molinillo {
    fun moler()
}

interface AccionPescado {
    fun comer()
}

interface ColorPescado {
    val color: String
}

object ColorDorado : ColorPescado {
    override val color = "dorado"
}

class AccionImpresionPescado(val comida: String) : AccionPescado {
    override fun comer() {
        println(comida)
    }
}

class Plecostomus(colorPescado: ColorPescado = ColorDorado) :
    AccionPescado by AccionImpresionPescado("come muchas algas"),
    ColorPescado by colorPescado

interface ColorEspecia {
    val color: String
}

object AmarilloColorEspecia : ColorEspecia {
    override val color = "amarillo"
}

class Curry(nombre: String, picor: String, val colorEspecia: ColorEspecia = AmarilloColorEspecia) :
    Especia(nombre, picor), Molinillo {

    override fun prepararEspecia() {
        moler()
    }

    override fun moler() {
        println("Moliendo curry")
    }
}

fun main() {
    val curry = Curry("Curry en polvo", "medio")
    println("El curry tiene un color ${curry.color}")
}