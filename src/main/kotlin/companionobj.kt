//to write a function or any member of the class that can be called without having the instance of the class
//by declaring the companion object, members of the class can be accessed  by class name only

//companion objects are singleton (object which is created only once and used everywhere)objects whose properties and functions are tied to a class but not to the instance of that class


enum class days(
    val weekend: Boolean = false
){
    sun(true),
    mon(),
    tues(),
    wed(),
    thur(),
    fri(),
    sat(true);

    companion object{
        fun now(obj:days): Boolean{
            return obj.name.compareTo("sun") ==0 and obj.name.compareTo("mon") != 0

        }
    }

}
fun main(){
    for(day in days.values()){
        //checking whether the value is weekend or not
        println("{$days.ordinal} =  ${day.name} and is weekend ${day.isWeekend}")
    }
   val today = days.wed;
    //printing true if the value is a weekend today
       println("Is today a weekend ${DAYS.today(today)}")
   }


//exp2:  variables in the companion object and access it with the help of the class name.

 class calling {
     companion object {
         fun callme() = println("the person is calling !!!")
     }
 }
fun main(args: Array<String>) {
    calling.callme()
}
//output : the person is calling !!!



//exp3 :
//to write a function that can be called without having a class instance but needs access to the internals of a class,
// can write it as a member of a companion object declaration inside that class.


class Manager(){
    private constructor()
}

companion object {
    private lateinit var  manager: Manager
    var manager : Manager
    get( ) {
        if(manager == null){
            manager == Manager()
        }
        return  manager
    }
}

fun Test(Name: String): Boolean {
    Log.d("Event Sent", Name)
    return true;
}
}