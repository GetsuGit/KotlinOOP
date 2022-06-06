package app

import data.Product

fun main() {
    val product = Product("Indome", 2500, "Food")
    println(product)

    val product2 = product.copy(name = "Supermie")
    println(product)
    println(product2)

}