package app

import data.Human
import data.Interface

fun main() {
    val human = Human( "Getsu")
    human.sayHello("Code")
    human.go()
    human.move()
}