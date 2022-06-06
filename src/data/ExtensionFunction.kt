package data

// bisa di akses karena public
class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String) {
    if (this != null){
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}