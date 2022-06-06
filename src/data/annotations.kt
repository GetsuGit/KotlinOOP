package data

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class annotations(val author: String)

@annotations(author = "Getsu")
class Framewrok(val name: String, val version: Int){

    fun info(): String = "Application $name-$version"
}

fun main(){
    val myFramework = Framewrok("Kotlin", 1)
    println(myFramework.info())
}