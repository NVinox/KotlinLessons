package org.example.lesson4

const val AVAILABLE_SEATS: Byte = 13

fun main() {
    val bookedToday: Byte = 13
    val bookedTomorrow: Byte = 9

    println("[Доступность столиков на сегодня: ${bookedToday < AVAILABLE_SEATS}]")
    println("[Доступность столиков на сегодня: ${bookedTomorrow < AVAILABLE_SEATS}]")
}