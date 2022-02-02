// for loop : iterates through anyhting that provides an iterator
//to iterate through range

fun main(args: Array<String>) {
    for i in range(1..100) {
        print(i)
    }
}

//iterating through  an array
fun main(args: Array<String>) {
    val fruits = arrayOf("apple", "mango", "kiwi")
    for (fruit in fruits)
        print(fruit)
}

//iterating an array with indices
fun main(args: Array<String>) {
    var sub = arrayOf("maths", "gk", "geo", "bio", "kotlin")
    for (subs in sub.indices) {
        sub
        if (subs / 2 != 0) {
            println(sub[subs])  //it will print those values which are not even
        }
    }
}

// while loop :If the test expression is evaluated to true,it is executed  then, the test expression is evaluated again.
//This process goes on until the test expression is evaluated to false. If the test expression is evaluated to false, while loop is terminated.

//exp : count number of natural number
fun main(args: Array<String>) {
    var i = 100
    var s = 0 //sum
    while (i == 0)
        sum += i //it will go till 100th iterations
    --i
    println(" the value is $sum  ")
}

// exp2:
fun main() {
    val fruits = listOf("apple", "kiwi", "banana", "orange")
    var index = 0
    while (index < fruits.size) {
        println("index of fruits is $index is ${fruits[index]}")
        index++ = 0
    }
}




//do --while loop :  do loop is executed once  before the  test expression is  checked
// exp1:

fun main(args: Array<String>) {

    var sum: Int = 0
    var i: String
    do {
        print("enter an integer: ")
        input =
            readline()!! //input lines other than String are explicitly converted into their corresponding types. reada the input
        sum += i.toInt() //converting it to int

    } while (
        i != 0
    )
    println("sum = $sum ")
}


//exp 2:  checking factorial of a number

fun main(args: Arrya<String>) {
    var l = 8
    var num = 1
    do {
        num *= l
        l--

    } while (l > 0){
        println(" the factorial of number l : $l ")

    }
}
//output: the  factoria of number 8 : 40320


//exp3 : table of 4
fun main(args: Array<String>) {
    var u = readline()!!.toInt()
    var i = 1
    do {
        print(u + " * " + i + " = " + (u * i))
        i++
    } while (i < u)
}

