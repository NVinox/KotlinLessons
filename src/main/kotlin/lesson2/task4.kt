package org.example.lesson2

const val BUFF: Float = 0.2f

const val CRISTAL_COUNT: Byte = 7
const val IRON_ORE_COUNT: Byte = 11

fun main() {
    println("Cristal bonus: ${(CRISTAL_COUNT * BUFF).toInt()}")
    println("Iron ore bonus: ${(IRON_ORE_COUNT * BUFF).toInt()}")
}