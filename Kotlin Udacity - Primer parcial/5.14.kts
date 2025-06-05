// Buildings.kt
package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("${actualMaterialsNeeded} ${material::class.simpleName} required")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
}