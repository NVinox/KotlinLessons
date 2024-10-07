package org.example.lesson1

const val SECONDS_IN_HOURS: Short = 3600
const val SECONDS_IN_MINUTE: Byte = 60

fun main() {
    val fullSeconds: Short = 6480
    val hours: Byte = (fullSeconds / SECONDS_IN_HOURS).toByte()
    val minutes: Byte = ((fullSeconds % SECONDS_IN_HOURS) / SECONDS_IN_MINUTE).toByte()
    val seconds: Byte = (fullSeconds % SECONDS_IN_MINUTE).toByte()

    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}