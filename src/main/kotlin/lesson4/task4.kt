package org.example.lesson4

fun main() {
    val dayOfTraining: Byte = 0
    val isEvenDay: Byte = (dayOfTraining % 2).toByte()

    println("""
        |Упражнения для рук    ${dayOfTraining == isEvenDay}
        |Упражнения для ног    ${dayOfTraining != isEvenDay}
        |Упражнения для спины  ${dayOfTraining != isEvenDay}
        |Упражнения для пресса ${dayOfTraining == isEvenDay}
    """.trimMargin())
}