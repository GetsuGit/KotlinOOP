package data

class Note(title: String) {

    var title1: String = title

        // getter
        get() = field

        // setter
        set(value){
            // field = value
            if (value.isNotBlank()){
                field = value
            } else {
                println("Invalid title")
            }
        }
}

class BigNote(val title: String){
    val bigTitle: String
       get() = title.uppercase()
}
