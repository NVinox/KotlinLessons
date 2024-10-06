package org.example.lesson2

const val WORKERS_COUNT: Byte = 50
const val WORKER_SALARY: Short = 30_000
const val INTERNS_COUNT: Byte = 30
const val INTERN_SALARY: Short = 20_000

fun main() {
    val fullWorkersSalary: Int = WORKER_SALARY * WORKERS_COUNT
    val fullEmployeesSalary: Int = INTERN_SALARY * INTERNS_COUNT + fullWorkersSalary
    val averageEmployeeSalary: Int = calculateEmployeesSalaryAverage()

    println(fullWorkersSalary)
    println(fullEmployeesSalary)
    print(averageEmployeeSalary)
}

fun calculateEmployeesSalaryAverage(): Int {
    val workersSalaryList: List<Short> = List(WORKERS_COUNT.toInt()) { WORKER_SALARY }
    val internsSalaryList: List<Short> = List(INTERNS_COUNT.toInt()) { INTERN_SALARY }
    return workersSalaryList.plus(internsSalaryList).average().toInt()
}