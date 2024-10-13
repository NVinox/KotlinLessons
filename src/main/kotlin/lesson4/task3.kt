package org.example.lesson4

const val UNAVAILABLE_TIME_YEAR: String = "зима"

fun main() {
    val isSunWeather: Boolean = true
    val isOpenTilt: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "зима"

    print("Благоприятные ли условия сейчас для роста бобовых? ${isSunWeather && isOpenTilt && (airHumidity == 20) && (timeOfYear != UNAVAILABLE_TIME_YEAR)}")
}