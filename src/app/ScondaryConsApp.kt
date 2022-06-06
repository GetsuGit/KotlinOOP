package app

import data.SecondaryConstructor

fun main(){


    val user1 = SecondaryConstructor("Getsu", "Code","Design")
    val user2 = SecondaryConstructor("Getsu", "Design")

    println(user1.name)
    println(user1.middle)
    println(user1.last)

    println(user2.name + " " + user2.last)



}