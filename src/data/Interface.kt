package data

class Interface {

    interface Interaction {
        val name: String
        fun sayHello(name: String)

    }



}
interface Go: Interface.Interaction {
    fun go(){
        println("Go!")
    }
}


interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

    class Human(override val name:String): Go, MoveA, MoveB {
        override fun move() {
            super<MoveA>.move()
            super<MoveA>.move()
            println("Move Human")
        }

        override fun sayHello(name: String) {
            println("Class Human")
        }
    }
