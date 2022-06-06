package data

open class Employee(val name: String) {

    open fun sayHello(name: String){
        println("Hello $name, My Name is ${this.name}")
    }
}

class Manager(name: String): Employee(name){
    override fun sayHello(name: String){
        println("Hello $name, My Name is ${this.name}")
    }
}
class VicePresident(name: String): Employee(name)