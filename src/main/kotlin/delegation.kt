// delegation controls the authority from instance to another for any object
//Multiple interfaces can be implemented
//exp1 :
interface del {
    fun tests()
    fun modes()
}

class deleg(val s: String) : del {
    override fun tests() {
        println(s)
    }

    override fun modes() {
        println(s)
    }
}

class delegate(m: del) : del by m {
    override fun modes() {
        println("have a good day")
    }
}

fun main(args: Array<String>) {
    val l = deleg("enjoy")
    delegate(l).tests()
    delegate(l).modes()
    //output : have a good day enjoy
}

//exp2: delegation : values

interface delegation
{
    val value: String
    fun mymessage()
}

class delegationimplementation(val y: String) : delegation
{
    override val value = "delegationimplementation y = $y"
    override fun mymessage()
    {
        println(value)
    }
}

class Newfeatures(a: delegation) : delegation by a
{
    override val value = "GeeksforGeeks"
}

fun main()
{
    val b = delegationimplementation("Hello!GFG")
    val derived = Newfeatures(b)

    derived.mymessage()
    println(derived.value)
}

interface test {
    val value: String
    fun modes()
}

class dell(val g: String) : test {
    override val value = "hey!!= $g"
    override fun modes() {
        println(value)
    }
}
class delleg(f:test) :test by f{
    override val value = "and good sleep"
}
fun main(){
    val la = dell("have a nice day ahead")
    val lm = delleg(la)
    lm.modes()
    println(lm.value)

    //output : hey!! have a nice day and good sleep
}