package app

import data.*
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {

   /*
    if (request.id == ""){
        throw ValidationException("id is blank")
    } else if (request.name == ""){
        throw ValidationException("name is blank")
    }
    */

    val clazz = request::class
    val propertise = clazz.memberProperties

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in propertise){
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            println("Succses")
            when (value){
                is String -> {
                    if ("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main(){
    val request = CreateProductRequest("1", "Tool", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("1", "2")
    validateRequest(request2)
}