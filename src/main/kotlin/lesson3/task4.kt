package org.example.lesson3

fun main() {
    var startMove: String = "E2"
    var finishMove: String = "E4"
    var moveNumber: Byte = 1

    println("$startMove-$finishMove:$moveNumber")

    startMove = "D2"
    finishMove = "D4"
    moveNumber = 2

    print("$startMove-$finishMove:$moveNumber")
}