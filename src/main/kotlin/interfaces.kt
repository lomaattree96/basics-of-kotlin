//interfaces : define a form of behaviour that the implementing type have to follow
//contains declarartions for abstract class and methods for implementing
//cannot store a state


interface car {
    val carname: String

}

interface cars : car {
    val type: String
    val model: String

    override val carname: String
        get() = "$type $model"
}

data class vcar(
    override val name: String
    overrride val type: String
    val carcolor: String
) : cars


//overriding conflicts resolved

//declaring  many types in  supertype list,may inherit more than one implementation of the same method:

interface ABC() {
    fun forr() {
        print("forr")
    }

    fun forr2() {}
}

interface DEF() {
    for forr2()
    { print("forr2") }
    for forr()
    { print("forr") }
}

class main : DEF {
    override fun forr2("foorrrr")
}

class main2 : ABC, DEF {
    override fun forr() {
        super<ABC>.forr()
        super<DEF>.forr()

    }

    override fun forr2() {
        super<DEF>.forr2()
    }

}


//SAM (single abstract method) interface : having only one abstract method
fun interface Intpredictable() {
    fun test11(i: Int): Boolean {
    }

    val isOdd = Intpredictable { it % 2 != 0 }
    fun main() {
        println("  Is number 9 odd: ${isOdd.accept(9)} ")
    }
}


//visibility modifiers : private , public, protected, internal
open class test4() {
    private val a = 34
    protected open val b = 344
    public val c = 1
    internal val d = 5

    protected class num {
        val dd: Int = 45
    }

    class sub : test4 {
        override val b = 455
        override val d = 58

        //a will not be visible  -- private val
        //others are visible
    }

    class outer(t: test4) {
        //t.a and t.b is not visible
        //t.d and t.c are visible
        //t.e is not visible(nested)
    }
}


//typechecking through if -else
fun main(args: Array<String>) {
    var name = "Loma"
    var age = 25
    var gender = "female"
    var salary = 34, 000

    val emplydet: List<Any> = listOf(name, age, gender, salary)
    for (attr in emplydet) {
        if (attr is String) { //is operator is used to check the type of variable at runtime
            println(" name  :$attr")
        } else if (attr is Int) {
            println(" age : $attr ")
        } else if (attr is String) {
            println("gender : $attr")
        } else if (attr is Double) {
            println("salary : $attr")
        }
    }
}


//extensions functions :extend a class without inheriting from class
//by calling extensions its making only new func callable
fun list<Int>.swap(ind1 :Int, ind2 : Int){
    val temp = this[ind1] //this depicts as reciever object inside extension fun
    this[ind2] = this[ind1]
    this[ind2] = temp
}


//exp 2:
open class Animals
class dogs : Animals()
fun Animals.getName() = "dogs"
fun dogs.getName() = "toben"

 fun  type(a:Animals){
     println(a.getName())
 }
type(dogs)//the output = dogs will be printed here , as  the extension function called depends only on the declared type a

//extensions as memebers : declare one class  inside another class
class amen(val namees: String){
    fun funamen(){
        println("funamen")
    }
    class pray(val host: String , val port : String) {
        fun funpray() {
            println("funpray")
        }

        fun ameen.connectoinpray(){
            funamen() // calling fun from class amen in
            funpray() // calling funpray
        }
        fun host(){
           host.connectionpray() //calling extension fun
        }
    }
    fun main(){
        pray(amen("ameeenn", "4543")).host()
//ouptut : ameeenn 4543
    }
}







