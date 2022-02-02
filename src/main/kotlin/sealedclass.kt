// sealed class  =  restricted or bounded class hierarchies
//defines a set of subclass within it

//A sealed class is implicitly abstract and hence it cannot be instantiated.

sealed class Test
    () val test1 :String )//sealed class with single string
{
    //subclasses within sealed class
    class test2 : Test("bfs")
     class test3 : Test("dfs")
}
//subclass outside sealed class
class mode: Test("mode")

//display msg depending on type of fruit

fun type( test :Test){
    when(test){
        is Test.dfs -> println("${test.test1}  prints dfs")
        is Test.mode -> println("${test.test1} print mode ")
        is Test.bfs -> println("${test.test1} print bfs ")
    }
}

fun main() {
    val obj = Test.test2()
    val obj2 = Test.test3()
    val obj3 = mode()

    display(obj)
    display(obj2)
    display(obj3)
}



//exp2 : Once a sealed class is declared, it can only be subclassed from inside the same package where it is declared

sealed class Animals(val type : String)
//defining subclass
class dog(val dogname: String ) : Animals( dogname)

class bird(val name: String, val legs : String) : Animals(name)

 fun Animaltype(animals:Animals) : String
 {
     when(animals){
         is dog -> return "${animals.dogname}" //casting animals to  dog
     is bird -> return " ${animals.name} and type of leg is ${animals.legs}" //casting animals to bird

     }
 }

fun main(){
    println(Animaltype(bird("Ostrich" , "long legs")))
    println(Animaltype(dog("toben")))
}



