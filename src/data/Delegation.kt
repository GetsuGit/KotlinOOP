package data

interface Base {
    fun sayHello(name: String)
}

class Mybase : Base{
    override fun sayHello(name: String) {
        println("Hello $name ")
    }
}

//class MyBaseDelegate(val base: Base): Base{
   // override fun sayHello(name: String) {
    //   base.sayHello(name)
  //  }
//}

class MyBaseDelegate(val base: Base) : Base by base