//when expression :  matches it expressions with all the classes
//exp 1:
enum class test(
    one, two, three
)

val value = when (getRandomBit()) {
    test.one -> 1
    test.two -> 2
    test.three -> 3 //else case not required because all cases are covered

}


//exp2 :
enum class subjects(
    kotlin,
    python,
    gk,
    geo,
    java
)
when( getSubjects()){
    subjects.kotlin -> println("kotlin")
    subjects.python -> println("python")
    subjects.gk -> println("geo")
    subjects.java ->println("java") //else case is not req as all cases are recovered
}
when(getSubjects()){
    subjects.kotlin -> println("kotlin") // no branches for other subjects
    else -> println("it is not a kotlin subject") // used when all the cases are not covered
}

//exp3 :
fun main(args: Array<String>) {
    val a = 90
    val b = 40
    println(" enter the operator you want : ")
    val operator = readline()
    when (operator) {
        "+" -> println(" $a + $b : ${a + b}")
        "-" -> println(" $a - $b : ${a - b}")
        "%" -> println("$a % $b : ${a % b}")
        "*" -> println("$a * $b : ${a * b}")
        else ->
            println(" operator is  invalid")
    }
}


//use expressions as branch condition

fun main(args: Array<String>) {
    val g = 20
    val n = "20"
    when (n) ->
    "apple" ->  println("it's an apple")
    12.toString() -> println(" its not 20")
    a.toString()  -> println("its the number 20")
    //output : its the number 20
}


//checking input value is in range or not
fun main(args: Array<String>) {
    val op = readline()
    println(" enter the month acc to range: ")
    val nn = reader.nextInt()
    when (op) { //in is used to check the existence of  particular var or property
        in 1..3 -> println(" its a spring season")
        in 4..6 -> println("its summer season")
        in 7..9 -> println(" its autumn season")
        in 10..12 -> println("its winter season")
        !in 1..12 -> println("not a valid month")
        // !in decides whether it is in between those 12 months or not

    }
}


// using when for replacement of if-else -if statement : branch condition is executed only when condition is true
//checking for prime number
fun isprime() {
    val num = readline()!!.toInt()
    var flag = false
    var i = 2
    while (i <= num / 2) {
        if (num % i == 0)
            flag = true
        ++i
    }
    if( !flag){
        println("num is prime number")
    }
    else{
        println("number is not prime number")
    }

}

fun isnotprime(num :Int, i :Int) { i != num /2 and num % i != 0}

fun main(args: Array<String>) {
    val cc = 34

    when(cc) {
        isprime(cc) -> println("number is prime")
        isnotprime(cc) -> println(" number is not prime")
        else -> println("number is neither prime  nor non prime")
    }


}


//when as expression

fun main(args: Array<String>)
{
    var nn = readline()!!.toString()
    println("enter the month of the year :")
    var months = reader.nextInt()
     var month = when(months){
         1 -> "Jan"
         2 -> "Feb"
         3 -> "May"
         4 -> "Aug"
         5 -> "Sept"
         6 - > "Nov"
         7 -> "Dec"
         else -> {
             println(" its not the month ")
         }
     }
    println(month)
}



//ForEach loop

fun test(){
    listOf(1,2,23,4,5).forEach {
        if (it == 3) return //return directly to the caller of test function
            print(it)
    }
    println("not valid")
}

//exp2:
fun test1(){
    lisOf(1,3,4,5,45,43).forEach lit{
        if(it == 45) return
        print(it)
    }
    println("done with explicit label")
    //output : 1,3,4,5,43
}

//for anonymous fun
fun tesst(){
    listOf(1,3,4,5,45,43).forEach(fun value: Int){
        if( it == 45) return
        print(value) //it will take the value from anonymous func

    }
    println("anonymous fun done") //output: 1,3,4,5,43
}

