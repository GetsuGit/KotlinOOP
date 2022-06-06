package data

class Data(val id : Int) {

    //var username: String = ""
    //var password: String = ""

    fun User(username: String){
        println("Username : $username")
    }

    fun User(username: String, password: String){
        println("Username : $username, Password : $password")
    }


}