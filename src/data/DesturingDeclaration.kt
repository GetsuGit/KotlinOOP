package data

data class Game(val name:String, val price: Int) {
    // operator fun component1(): String = name
    // operator fun component2(): Int = price
}

data class MinMax(val min: Int, val max: Int)

data class Login(val username: String, val password: String)