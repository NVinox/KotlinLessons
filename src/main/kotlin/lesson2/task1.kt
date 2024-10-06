package org.example.lesson2

fun main() {
    val studentPointsAverage: Double = listOf(3, 4, 3, 5).average()
    print(String.format("%.2f", studentPointsAverage))
}