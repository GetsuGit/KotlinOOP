package data

class TanpaScondary(){

    var name: String = ""
    var street: String = ""
    var city: String = ""

    constructor(paramName: String, paramStreet: String) : this() {
        name = paramName
        street = paramStreet
    }

    constructor(parameterName: String, paramStreet: String, paramCity : String)
            : this(parameterName, paramStreet) {

        city = paramCity
    }

}
