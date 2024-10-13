package org.example.lesson4

const val availableSeats: Byte = 13

fun main() {
    val bookedToday: Byte = 13
    val bookedTomorrow: Byte = 9

    println("[Доступность столиков на сегодня: ${bookedToday < availableSeats}]")
    println("[Доступность столиков на сегодня: ${bookedTomorrow < availableSeats}]")
}