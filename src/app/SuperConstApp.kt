package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main(){

    val premium = PremiumCustomer("Getsu")
    println(premium.name)

    val execute = ExecutiveCustomer("Getsu Code", 10000)
    println(execute.name)
    println(execute.balance)

}