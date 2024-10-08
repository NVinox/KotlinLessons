package org.example.lesson3

const val GREETING: String = "How are you?"

fun main() {
    val name = "Sergey"
    var timeOfDay = "Good afternoon"

    println("$timeOfDay, $name! $GREETING")

    timeOfDay = "Good evening"

    println("$timeOfDay, $name! $GREETING")
}