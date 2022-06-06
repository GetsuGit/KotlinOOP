package data

open class Main {
      open val corner: Int = -1

    // Overriding Function
    open fun printName(){
        println("This is Main")
    }
}

class SubMain1: Main(){
    override val corner: Int = 4
    val parentCorner: Int = super.corner

    // Overriding Function
    override fun printName() {
        println("This is SubMain1")
        super.printName()
    }

}

open class SubMain2: Main(){
    override val corner: Int = 3
}
