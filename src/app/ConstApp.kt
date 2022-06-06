package app

import data.Constructor

fun main(){

    val toyota = Constructor("Toyota")
    val almaz = Constructor("Honda", 2020)

    println(toyota.brand)
    println(toyota.year)

    println(almaz.brand)
    println(almaz.year)



}

