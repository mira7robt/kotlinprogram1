//Step 1: Understand more about lists
val list = listOf(1, 5, 3, 4)
println(list.sum())

val list2 = listOf("a", "bbb", "cc")
println(list2.sum())

val list2 = listOf("a", "bbb", "cc")
println(list2.sumBy { it.length })

val list2 = listOf("a", "bbb", "cc")
for (s in list2.listIterator()) {
    println("$s ")
}

//Step 2: Try out hash maps
val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
println (scientific.get("guppy"))
println(scientific.get("zebra fish"))

println("scientific.get("swordtail"")
println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
