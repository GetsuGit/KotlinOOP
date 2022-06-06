package data

class SecondaryConstructor(firstNameParam: String,
                           middleNameParam: String,
                           lastNameParam: String) {

    var name: String = firstNameParam
    var middle: String = middleNameParam
    var last: String = lastNameParam


    init{
        println("User name is $firstNameParam")
    }

   // harus memasukan semua contructor primary
    // agar dapat membuat scondari constructor
    constructor(firstNameParam: String, lastNameParam: String) :
                this (firstNameParam, middleNameParam = "",lastNameParam ){

                    println("Scondary Constructor")
                }
}

