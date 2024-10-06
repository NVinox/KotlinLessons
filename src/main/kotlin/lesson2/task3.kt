package org.example.lesson2

const val MINIMUM_SECONDS: Byte = 10
const val MINUTES_IN_HOUR: Byte = 60
const val HOURS_IN_DAY = 24

const val HOUR_DEPARTURE: Byte = 9
const val MINUTE_DEPARTURE: Byte = 39
const val TIME_TRAVEL: Short = 457

fun main() {
    val fullMinutesArrival: Int = HOUR_DEPARTURE * MINUTES_IN_HOUR + MINUTE_DEPARTURE + TIME_TRAVEL
    val hoursArrival: Byte = calculateHoursArrival(fullMinutesArrival)
    val minutesArrival: String = calculateMinutesArrival(fullMinutesArrival)

    print("${hoursArrival}:${minutesArrival}")
}

fun calculateHoursArrival(minutes: Int): Byte {
    val hoursArrival: Int = minutes / MINUTES_IN_HOUR

    if (hoursArrival % HOURS_IN_DAY != 0) {
        return (hoursArrival % HOURS_IN_DAY).toByte()
    }

    return hoursArrival.toByte()
}

fun calculateMinutesArrival(minutes: Int): String {
    val minutesArrival: Int = minutes % MINUTES_IN_HOUR

    if (minutesArrival < MINIMUM_SECONDS) {
        return "0${minutesArrival}"
    }

    return minutesArrival.toString()
}