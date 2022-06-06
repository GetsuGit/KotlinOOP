package app

import data.Boss

fun main() {
    val boss1 = Boss("Getsu")
    val employee1 = boss1.Employee("Code")
    val employee2 = boss1.Employee("Design")

    employee1.hi()
    employee2.hi()

}