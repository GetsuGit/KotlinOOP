package app

import data.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()){
        throw ValidationException("Name is blank")
    }
    if (name.any()){
        throw Throwable("Unknwoing input")
    } else {
        println("Hello $name")
    }
}

fun main() {
    // validateAndSayHello("Getsu")
    // validateAndSayHello("")

    try{
        validateAndSayHello("User")
        validateAndSayHello("")
        println("Example")
    } catch (error: ValidationException){
        println("program is error ${error.message}")
    } catch (error: Throwable){
        println("program ${error.message}")
    } finally {
        println("Program is done...")
    }
}