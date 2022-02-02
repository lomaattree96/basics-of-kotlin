//lazy properties:  The first call to get() executes the lambda passed to lazy() and remembers the result.
// Subsequent calls to get() simply return the remembered result.

//exp1:
class demo(){
    val lazyvalue: String by lazy{
        println("hey")
        "how are you"
    }
}
fun main(){
    println(lazyvalue)
    println(lazyvalue)
}


//exp2: observable properties : takes initial value and handler for modifications
//handler is called everytime a property is assigned
class demos(){
    var type: String by Delegates.observable("<hey>")
    {
        prop, old,new ->
        println("$old -> $new")

    }
}
fun main(){
    val types = demos()
    types.type = "first"
    types.type = "Second"
}
//output:
 //hey -> first  //// first->Second



