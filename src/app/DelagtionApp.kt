package app

import data.MyBaseDelegate
import data.Mybase


fun main() {

    val base = Mybase()
    base.sayHello("Getsu")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Code")
}