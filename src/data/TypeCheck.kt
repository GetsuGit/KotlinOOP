package data

fun printObject(any: Any) {

    if(any is Laptop){
        println("Laptop with name ${any.name}")
    } else if (any is SmartPhone){
        println("HandPhon e with name ${any.os}")
    } else {
        println(any)
    }
}

fun printObject1(any: Any) {

    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is SmartPhone -> println("HandPhone with name ${any.os}")
        else -> println(any)
    }
}

// Cast
fun printString(any: Any){
    val value = any as String
    // val value: String? = any as? String (Safe Cast)
    println(value)

}

fun main(){

    printString("Getsu")
    //printString(1) / null

   printObject("Getsu")
   printObject(1)
   printObject(Laptop("Acer"))
    printObject(SmartPhone("Samsung", "Android"))

}