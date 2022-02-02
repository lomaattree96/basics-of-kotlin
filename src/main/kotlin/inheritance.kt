//Inheritance : allows all features from existing class to be inherited by a new class

//kotlin inheriting property and methods from base class
open class test {
    val intro = "Hello ! I am Loma"
    fun M() {
        print("test")
    }
}

class mode : test() {
    fun V() {
        println(intro) //inherit intro property
        println("mode")
    }
}

fun main(args: Array<String>) {
    val modes = mode()
    modes.M() //inheriting from test class
    modes.V() //inheriting from mode class
}


//exp2:

open class Customer(name: String, age: Int, gender: String) {
    init {
        println(" name is $name ,  age is $age, gender is $gender")
    }
}

class Iosdev(name: String, age: Int, gender: String) : Customer(name, age, gender) {
    fun IOSdevep() {
        println("hey , its IOS developer")

    }
}

class Androiddev(name: String, age: Int, gender: String) : Customer(name, age, gender) {
    fun Androiddevep() {
        println("hey , its android developer")
    }
}

class Webdev(name: String, age: Int, gender: String) : Customer(name, age, gender) {
    fun Webdevep() {
        println("hey , its web developer")
    }
}

fun main(args: Array<String>) {
    val iosde = Iosdev("V", 27, "Male")
    iosde.IOSdevep()

    val androde = Androiddev("Tae", 25, "Female")
    androde.Androiddevep()

    val webde = Webdev("Kai", 28, "Male")
    webde.Webdevep()

}


//exp3 primary constructor inheritance

open class web(names: String, agee: Int) {
    init {
        //for secondary constructor :
        //constructor(name : String , age: Int){println("")}
        println("name of web : $names")
        println("age of web : $agee ")
    }
}

class web1(name: String, age: Int, genderr: String) : web(name, agee) {
    init {
        //for secondary constructor :
        //class web1() :constructor(name : String , age: Int):super(name, age){ {println("")}}
        println("gender of web1 : $genderr")
    }
}

fun main(args: Array<String>) {
    web1("loma", 25, "female")
}

// exp : ::: superclass implementation

open class rect { //base class
    open fun rect1() {
        println("draw a rectangle")
    }

    val bcolor: String get() = "blue"
}

class fillrec : rect() { //derived class
    override fun rect1() {
        super.rect1()
        println("draw rectangle")
    }

    val color: Stirng get() = super.bcolor
}


