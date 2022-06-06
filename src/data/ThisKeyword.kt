package data

class ThisKeyword {

    var username:  String = ""

    fun User(username: String, password: String){

        println("Hello $username, My Name is ${this.username}, My ID is $password")
    }


}