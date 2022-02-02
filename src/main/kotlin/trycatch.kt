// try- catch block
// exception : unwanted event happen at run time event

//exp1 : arithmetic error

fun main(args: Array<String>){
    try{
        var n = 10/0 //throws an error
    }
    catch(e: ArithmeticException) {
        println("not allowed")
    }
}


//exp 2 : try catch block as expression

fun test(a: Int, b:Int) :Any {
    return try{
       a/b
    }
    catch(e: Exception){
        print(e)
        "divide by zero is not allowed"
    }
    fun main(args: Array<String>){
        var res = test(10/2)
        println(res)

        var eres = test(10/0)
        println(eres)
    }
}

//finally block : it is always executed whether  an exception is handled or not
fun main(args: Array<String>){
    try {
        var array = arrayOf(1,2,3,4,5,6,7)
        var int = array[9]
        println(int)
    }
    finally{
        pritnln("this block is always executed")
    }
}



//throw case:
fun main(args: Array<String>)
{
    testss("abcd")
    println("executed after validation")
}

fun tests( password: String) {
    if(password.length<5)
        throw ArithmeticException("password is short") //output: password too short
    else {
        println("password too strong")
    }
}