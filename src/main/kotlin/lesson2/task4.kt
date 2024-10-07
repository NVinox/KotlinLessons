package org.example.lesson2

const val BUFF: Byte = 20

fun main() {
    val cristalCount: Byte = 7
    val ironOreCount: Byte = 11

    println("Cristal bonus: ${cristalCount * BUFF / 100}")
    println("Iron ore bonus: ${ironOreCount * BUFF / 100}")
}