package app

import data.Student
import data.sayHello
import data.upperName

fun main(){
    val student: Student = Student("Getsu", 15)
    student.sayHello("code")
    println(student.upperName)
}