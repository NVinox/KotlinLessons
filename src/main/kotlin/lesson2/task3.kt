package org.example.lesson2

const val MINUTES_IN_HOUR: Byte = 60
const val HOURS_IN_DAY = 24

fun main() {
    val hourDeparture: Byte = 9
    val minuteDeparture: Byte = 39
    val timeTravel: Short = 457
    val fullMinutesArrival: Int = hourDeparture * MINUTES_IN_HOUR + minuteDeparture + timeTravel
    var hoursArrival: Byte = (fullMinutesArrival / MINUTES_IN_HOUR).toByte()
    val minutesArrival: Int = fullMinutesArrival % MINUTES_IN_HOUR

    if (hoursArrival % HOURS_IN_DAY != 0) {
        hoursArrival = (hoursArrival % HOURS_IN_DAY).toByte()
    }

    print("%02d:%02d".format(hoursArrival, minutesArrival))
}