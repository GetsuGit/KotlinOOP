package app

import data.Hero1
import data.MainHero
import data.Manager
import data.VicePresident

fun main(){
    val manager = Manager("Getsu")
    manager.sayHello("Rifki")

    val vicepres= VicePresident("Getsu")
    vicepres.sayHello("Rifki")

    val hero = Hero1(100)
    hero.heroLevel(15)

}