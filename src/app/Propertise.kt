package app

class Propertise {

    var name = ""
    var firstname = "GETSU"
    var lastname = "CODE"
    var fullname = firstname + " " + lastname
    var age : Int = 26
}

fun main(){

    // manipulasi immutable data propertise
    val data = Propertise()
    data.firstname = "GETSU"
    data.lastname = "DESIGN"


    println(data.fullname)
    println(data.firstname)
    println(data.lastname)
}