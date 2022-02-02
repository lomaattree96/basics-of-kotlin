//A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is a part of the class header,
// and it goes after the class name and optional type parameters


class carcons(){
    // var mileddrive: Byte
    var owner: String?= null
    var price: Double?= null
    var model: String?= null
    var milesdrive: Int?= null
    constructor(owner: String, price:Double,model:String, milesdrive:Int) : this(){
        println("owner: $owner")
        println("price: $price")
        println("model: $model")
        println("milesdrive: $milesdrive")
        this.owner = owner
        this.price = price
        this.model = model
        this.milesdrive = milesdrive


    }
    constructor(name:String): this()
    {
        println("new class will be:")
    }
    fun getprice():Double?{
        return this.price!! - (this.milesdrive!!.toDouble()*10)
    }
    fun getowner(): String?{
        return this.owner;
    }
}
fun main(args:Array<String>){
    var c = carcons("loma")
    var hcar = carcons("tae",10000.0,"x20",20)
    println("getprice:" +hcar.getprice())
    println("getowner:" +hcar.getowner() )

    var lcar = carcons("kai",12023.0,"x5",12)
    println("getprice: " +lcar.getprice())
    println("getowner:" +lcar.getowner())
}
//to call this carcon class from the same package make another kotlin class
// import `class`.exp.`package`.Cars
//import class.exp.package.Cars
fun main(args:Array<String>){
    /*  var c = carcons("loma")
      var hcar = carcons("tae",10000.0,"x20",20)
      println("getprice:" +hcar.getprice())
      println("getowner:" +hcar.getowner() )

      var lcar = carcons("kai",12023.0,"x5",12)
      println("getprice: " +lcar.getprice())
      println("getowner:" +lcar.getowner())

     */
    var myclass = Cars()
    myclass.showinfo()

}
// package `class`.exp.`package`

class Cars(){
    /*fun  show_info(){
        println("new car is audi")

    }*/

    fun showinfo() {
        println("new car is audi")
    }
}