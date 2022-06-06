package app

import data.BigNote
import data.Note

fun main(){

    val note = Note("Belajar Kotlin")
     println(note.title1)

    note.title1 = "Belajar Coding"
    println(note.title1)

    val bigNote = BigNote("Belajar Kotlin 1")
    println(bigNote.title)
    println(bigNote.bigTitle)

}