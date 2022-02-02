// to create an object that is a slight modification of some class, without explicitly declaring a new subclass for it: object expression and declarations is used

//object expressions:
 object  class Person(){
     fun play(){println(" play games")}
    fun sleep(){println("sleep properly" )}
    open fun enjoy(){println("enjoy your day")}
 }
fun main(args:Array<String>)
{
    val human = object : Person() {
        override fun enjoy()
        println("i m not enjoying my day")
    }
    human.play()
    human.enjoy()
    human.sleep()
    //output: play games
    //i m not enjoying my day
    //sleep properly
}

//exp2: implementing a class that has a constructor to declare an anonymous object,pass appropriate constructor parameters.

object class Person1(name:Stirng, age:Int )
{
    init{
      println("name : $name, age :$age")
    }
    fun play(){println("play games")}
     fun sleep(){println("i m not sleep properly")}
    fun enjoy() {println("enjoy  your day")}
}
fun main(args:Array<String>){
    val huma = object: Person1(){
        override fun sleep(){ println("sleep properly")}

    }
    huma.play()
    huma.sleep()
    huma.enjoy()
    //output: name: loma, age: 25
    //play games
    //sleep properly
    //enjoy your day
}