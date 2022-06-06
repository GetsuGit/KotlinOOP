package data

open class MainHero(val level: Int) {

    open fun heroLevel(level: Int) {
        println("Hero level is $level and point level is ${this.level}")
    }
}
    open class Hero1(level: Int): MainHero(level){
        override fun heroLevel(level: Int) {
            println("Hero level is $level and point level is ${this.level}")
        }
    }

     // bersifat open karna mengikuti class overriding
     // kalau final tidak bisa
     class SuperHero1(level: Int): Hero1(level){
         override fun heroLevel(level: Int) {
             println("Super Hero level is $level and point level is ${this.level}")
         }
     }

    class Hero2(level: Int): MainHero(level){

    }
