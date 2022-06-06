package app

import data.Main
import data.SubMain1

fun main(){

    val main = SubMain1()
    println("Corner ${main.corner}")
    println("Parent Corner ${main.parentCorner}")

    main.printName()

}