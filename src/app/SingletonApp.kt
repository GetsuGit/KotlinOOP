package app

import data.Application
import data.Utilities

fun main(){
    println(Utilities.name)
    Utilities.name = "change"
    println(Utilities.toUpper("Getsu"))

    test1()
    test2()

    println(Application.Util.toUpper("getsu code"))
}

fun test1(){
    println(Utilities.name)
}

fun test2(){
    println(Utilities.name)
}