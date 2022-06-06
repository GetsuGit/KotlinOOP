package data

// val name is public

open class Teacher(val name:String) {

    // fun teach() is public or private
    private fun teach(){
        println("Teach!")
    }

    open protected fun test(){
        println("Test")
    }
}

class SuperTeacher(name:String): Teacher(name){

    override public fun test(){
        super.test()
    }

}