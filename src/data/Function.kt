package data

class Function {

    var name: String = ""

    fun sayHello(hobby : String){
        println("Hello $name, My Hobby is $hobby ")
    }

    fun run(){
        println("This is from function")
    }

    fun getUser(): String {
        return   "$name"
    }

}