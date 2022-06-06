package app

import data.Data
import data.User

fun main(){

    val user = Data(10011)
    println(user.id)

    user.User("Getsu")
    user.User("Getsu","1995")

}