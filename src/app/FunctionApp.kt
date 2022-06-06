package app

import data.Function

fun main(){

    val user = Function()

    user.name = "Getsu"

    user.sayHello("Eating")

    user.run()
    val fullUser = user.getUser()
    println(fullUser)


}