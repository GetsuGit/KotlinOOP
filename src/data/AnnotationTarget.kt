package data

import kotlin.annotation.AnnotationTarget

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class AnnotationTargets()

class ExampleTarget(
    @field:AnnotationTargets val firstName: String,
    @get:AnnotationTargets val middleName: String,
    @param:AnnotationTargets val lastName: String
)


