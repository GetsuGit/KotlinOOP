package app

import data.Company

fun main(){
        val company1 = Company("Getsu","Design")
        val company2 = Company("Getsu","Code")

            println(company1 == company2)
            println(company2 == company1)
            println(company1 == company1)
}