//makes it easier to create classes that store values



data class Customer(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is Customer && other.id == this.id
    //Override the default equals method by declaring customer equal if they have the same id.
}
fun main() {
    val customer = Customer("loma", 1)
    println(customer)

    val secondcustomer = Customer("loma", 1)
    val thirdcustomer = Customer("V", 2)
//The equals() returns true if two objects are equal (has same hashCode()).
// If objects are not equal, equals() returns false
    println("customer == secondcustomer: ${customer == secondcustomer}")   // equals considers two instances equal if their ids are equal
    println("customer == thirdcustomer: ${customer == thirdcustomer}")

    // hashCode() function : The hasCode() method returns hash code for the object.
    // If two objects are equal, hashCode() produces the same integer result
    println(customer.hashCode())  //Data class instances with exactly matching attributes have the same hashCode.
    println(secondcustomer.hashCode())
    println(thirdcustomer.hashCode())

    // copy() function
    println(customer === customer.copy())  //copy creates a new instance, so the object and its copy have distinct references.
    println(customer.copy("Tae"))
    println(customer.copy(id = 3))

    println("name = ${customer.component1()}")//Auto-generated componentN functions let you get the values of properties in the order of declaratio
    println("id = ${customer.component2()}")
}


//A destructuring declaration creates multiple variables at once. gender,  name and age, and can use them independently: destructing declaration


data  class User( val name: String , val age :Int, val gender: String)
fun main(args: Array<String>){
val c = User("loma" , 25, "Female")
    val (name, age, gender) = c
    println("name = $name")
    println("age = $age")
    println("gender = $gender")
}