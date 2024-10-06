package org.example.lesson1

const val SECONDS_IN_HOURS: Short = 3600
const val SECONDS_IN_MINUTE: Byte = 60

fun main() {
    val fullSeconds: Short = 6480
    val formatedHours: String = formatSecondsInHHFormat(fullSeconds)
    val formatedMinutes: String = formatSecondsInMMFormat(fullSeconds)
    val formatedSecond: String = formatSecondsInSSFormat(fullSeconds)

    print("${formatedHours}:${formatedMinutes}:${formatedSecond}")
}

fun formatSecondsInHHFormat(seconds: Short): String {
    val hours: Byte = (seconds / SECONDS_IN_HOURS).toByte()
    return convertTimeFormat(hours)
}

fun formatSecondsInMMFormat(seconds: Short): String {
    val minutes: Byte = ((seconds % SECONDS_IN_HOURS) / SECONDS_IN_MINUTE).toByte()
    return convertTimeFormat(minutes)
}

fun formatSecondsInSSFormat(seconds: Short): String {
    val actualSeconds: Byte = (seconds % SECONDS_IN_MINUTE).toByte()
    return convertTimeFormat(actualSeconds)
}

fun convertTimeFormat(time: Byte): String{
    if (time < 10) {
        return "0${time}"
    }
    return  time.toString()
}