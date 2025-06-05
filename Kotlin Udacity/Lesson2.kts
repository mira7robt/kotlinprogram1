fun leasson2() {
    val totalFish = 2 + 71 + 233 - 13
    println("Remaining fish: $totalFish")
    println("Aquariums needed: ${(totalFish + 29) / 30}") // (totalFish + (fish_per_aquarium - 1)) / fish_per_aquarium for ceiling division
}
