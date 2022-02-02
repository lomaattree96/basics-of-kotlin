//Enum is a special class or data types that represents a group of constants.
//Cannot create objects but constants can be static, final , public
//Each enum constant is an object

enum class months {
    Jan,
    Feb,
    May,
    Aug,Sept,Nov,Dec

}

//methods in enum == values, valuesof
fun main1(){
    for (month in months.values()){
        println(" months are ${months.values()}")
        // values will print all the list of the constant defined in the enum class
        println("months are ${months.valueOf("Sept")}")

            //valuesOf will print the specific enum constant defined in enum, matching the input string.
    // //If the constant, is not present in the enum, then an IllegalArgumentException is thrown.

    }

}


//example 2
// enum class with three constant
enum class Mode{
    running,
    loading,
    error

}
fun main(){
    //access and enum constant with its class name
    val mode = Mode.running
    val message = when(Mode){
        Mode.running -> "1--> it is in running state"
        Mode.error  ->"2 --> error state"
        Mode.loading -> "loading state"
    }
    println(message)
    //message will print the mode what is it accessing
}

//exp3
//enum class with property and method
enum class month(
    val month: String
)
{//passing argument for the constructor parmater
    first("Jan"),
  fifth("may"),
    eigth("aug"),
    ninth("sept"),
    twelve("dec")
    eleven("nov")

    fun list() = (this.month and ninth != 0)
}
fun mainn(){
    val sept = month.ninth
    println(sept)
    println(month.twelve) //calling a method via enum constant
    println(month.eigth.list()) //calling a method via a enum class name

}


//exp4 : Enum constants can behave as anonymous classes be implementing their own functions along with overriding base functions
enum class Months(var shorthand: String) {
    January("JAN"){
        override fun printSomething() {
            println("First month of the year.")
        }
    },
    February("FEB"){
        override fun printSomething() {
            println("Second month of the year.")
        }
    },
    March("MAR"){
        override fun printSomething() {
            println("Third month of the year.")
        }
    };
    var a: String = "Hello, Kotlin Enums"
    abstract fun printSomething()
}

fun main(args: Array<String>) {
    Months.February.printSomething() //prints Second month of the year.
    println(Months.February.a) //prints Hello, Kotlin Enums
}

