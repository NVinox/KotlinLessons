package org.example.lesson3

fun main() {
    val name: String = "Татьяна"
    val patronymic: String = "Сергеевна"
    var surname: String = "Андреева"
    var age: Byte = 20

    println("$surname $name $patronymic, $age")

    surname = "Сидорова"
    age = 22

    print("$surname $name $patronymic, $age")
}