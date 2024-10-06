package org.example.lesson1

fun main() {
    val ordersCount: UByte = 75u
    val gratitudeMessage: String = "Thanks for your purchase!"
    var workersCount: UShort = 2000u

    println("Orders count: ${ordersCount}")
    println("Gratitude message: ${gratitudeMessage}")
//    println("Workers count: ${workersCount}")

    workersCount = 1999u

    print("Actual workers count: ${workersCount}")
}