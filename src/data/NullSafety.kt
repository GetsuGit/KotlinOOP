package data

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
    if(friend != null){
        println("Hello ${friend.name}")
    }
}

fun sayHello1(friend: Friend?){
    val name = friend?.name ?: "Getsu"
    println("Hello $name")
}

fun sayHello2(friend: Friend?){
    val notNullFriend = friend!!
    val name = notNullFriend.name
    println("Hello $name")
}

fun main(){
    sayHello(Friend("Eko"))
    sayHello(null)

    sayHello1(null)

    sayHello2(null) // error
}