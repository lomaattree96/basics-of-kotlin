// nested class is the class within in a class
//by default nested class property is static so it can be accessed with the help of "."
//exp1:
class parentclass() {
    var str = "hello"

    class childclass() {
        var firstname = "loma"
        var lastname = "Attree"
    }
}
fun main(args:Array<String>){
    println(parentclass.childclass().firstname)
    println()
    println(parentclass.childclass().lastname)
}

//exp2: to call nested class function
class parclass(){
    var str = "hello"
    class child(){
        var name = "Loma Attree"
        fun childc(text : String) :String{
            var text2 = name.plus(text)
            return text2
        }
    }
}
fun main(args: Array<String>)
{
    val nested = parclass.child()
    var result = nested.childc("have a good day")
    println(result)
}


//INNER CLASS

//exp1 : calling without inner keyword
class par(){
    var str = "hello"
    // innerClass declaration without using inner keyword
    class childd(){
        var names = "Loma "
        fun chil() :String{
            var s2 = str //give error unresolved reference str
            return s2
        }
    }
}
fun main(args: Array<String>){
    val nes = par.childd()
   println(inner.chil())

}

//using inner keyword
class par1(){
    var strr  = "hey"
    inner class chill(){
        var nam  = "loma"
        fun check():String{
            var s1 = strr
            return s1
        }
    }
}
fun main(args: Array<String>){
    val nest = par1().chill()
    println(inner.check() + "have a good day")
}
//output : hey loma have a good day