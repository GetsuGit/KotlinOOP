package data

class Constructor (paramBrand: String, paramYear: Int = 2022){

    var brand: String = paramBrand
    var year: Int = paramYear

    // Initializer Block
    init {
        println("Car $paramBrand dibuat")
    }


}
