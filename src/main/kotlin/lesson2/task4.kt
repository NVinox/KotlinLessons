package org.example.lesson2

const val BUFF: Byte = 20
const val FULL_PERCENT: Byte = 100

fun main() {
    val cristalCount: Byte = 7
    val ironOreCount: Byte = 11

    println("Cristal bonus: ${cristalCount * BUFF / FULL_PERCENT}")
    println("Iron ore bonus: ${ironOreCount * BUFF / FULL_PERCENT}")
}