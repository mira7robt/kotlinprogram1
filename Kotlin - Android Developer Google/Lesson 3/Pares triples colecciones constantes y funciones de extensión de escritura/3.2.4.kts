//Step 1: Learn about const vs. val
const val rocks = 3

val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

//Step 2: Create a companion object
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}