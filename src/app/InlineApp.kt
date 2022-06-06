package app

import data.Token

fun main(){

    val login = Token("secret token")
    println(login.toUpper())

}