package data

class Company(val name: String, val otherName: String) {

    // agar tidak kenak hashcode
    override fun hashCode(): Int {
       return name.hashCode()

    }

      override fun equals (other: Any?): Boolean {
          return when (other){
              is Company -> other.otherName == this.otherName
              else -> false
          }
      }


}