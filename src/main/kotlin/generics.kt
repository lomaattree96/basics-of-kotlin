// generics : used to access classes,methods and properties which can be accessible using any data types , keeping check of compile time type safety

//exp1: without generics
class demo(text: String) {
    var test = text

    init {
        println(test)
    }
}

fun main(args: Array<String>) {
    var names: demo = demo("loma")
    var gender: demo = demo("female")
    var age: demo(25) //will give compile time error as it doesnot match with the type string
}

// epx2: with generics

class demo<T>(text: T) {
    var test = text

    init {
        println(test)
    }
}

fun main(args: Array<String>) {
    var names: demo<String> = demo("loma")
    var gender: demo<String> = demo("female")
    var age: demo<Int> = demo(25) //wont give any error
}

//VARIANCE: invariance is the property by which a particular generic fun or class cannot be defined for a particular data type
// this can be solved with the help of OUT and IN keywords
//exp3: out and in keywords
class demo<out T>(val value: T) {
    fun basic(): T {
        return value
    }
} //outclass is produced that can return the value of type T

fun main(args: Array<String>) {
    val democlass = demo("Hello")// assign an instance of the OutClass to the reference that is a supertype of it
    val refer: demo<Any> = democlass

    // to assign the value to its subtype "in" keyword can be used
}

//covariance : generic class/function should accept subtypes of data that is already defined
//exp : generic class defined for Number can accept Int, but a generic class defined for Int cannot accept Number.
//exp:
fun main() {
    val a: Myclass<Any> = Myclass<Int>() //returns error as type is mismatched
    val b: Myclass<out Any> = Myclass<String>() // works well as subtype is passed as string
    val c: Myclass<out String> = Myclass<Any>() //returns error as "Any" is supertype of class
}

// to solve this : directly allow covariance by appending out keyword to the declaration site
fun main(args: Array<String>) {
    val b: Myclass<Any> = Myclass<String>()
}

class Myclass<Out T>

//contravariance : allows supertype value in subtypes:
fun main(args: Array<String>) {
    var a: Content<child> = Content<parent>()
    var b: Content<parent> = Content<child>() //gives error
}

open class parent
class child : parent()
class Content<in T>()


//type projections : to copy all elements of some type array into "Any" type array "OUT" keyword can be used to annotate this
fun tab(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    //copying array from some type to any
    for (i in from.indices) {
        to[i] = from[i]
    }
    //printing elements
    for (i in to.indices) {
        println(to[i])
    }
}

fun main(args: Array<String>){
    val incc:Array<T> = Array<Int>(arrayOf(1,2, 3,4))
    val arr: Array<Any> =Array<Any>(3){""}
    tab(incc, arr)
    //output : 1 2 3 4
 }
//star projection : when we dont know  about specific type of the value so to print all the elements * is used
fun printArray(array: Array<*>){
    array.forEach(){ print(it)}
}
fun main(args: Array<String>){
    val type = arrayOf("hello!","how","are","you")
    printArray(type)
}