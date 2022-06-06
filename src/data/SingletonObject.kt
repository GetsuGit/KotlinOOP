package data

// singleton menggunakan objek
object Utilities {
    var name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

class Application(val name: String){

    object Util {
        fun toUpper(name : String): String{
            return name.uppercase()
        }
    }


}