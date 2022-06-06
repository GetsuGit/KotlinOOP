package data

class CompanionData (val name: String) {

    companion object {
        fun toUpper(name: String): String{
            return name.uppercase()
        }
    }


}