package org.example.lesson4

const val MIN_WEIGHT: Byte = 35
const val MAX_WEIGHT: Byte = 100
const val MAX_VOLUME: Byte = 100

fun main() {
    val firstCargoWeight: Byte = 20
    val firstCargoVolume: Byte = 80
    val secondCargoWeight: Byte = 50
    val secondCargoVolume: Byte = 100

    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average': ${(firstCargoWeight > MIN_WEIGHT) && (firstCargoWeight <= MAX_WEIGHT) && (firstCargoVolume < MAX_VOLUME)}")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': ${(secondCargoWeight > MIN_WEIGHT) && (secondCargoWeight <= MAX_WEIGHT) && (secondCargoVolume < MAX_VOLUME)}")
}
