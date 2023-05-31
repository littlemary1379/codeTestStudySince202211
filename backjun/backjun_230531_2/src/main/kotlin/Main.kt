fun main(args: Array<String>) {
    question2908()
}

fun question2908() {
    var numberArray = readLine()!!.split(" ").map { it.reversed().toInt() }
    println(numberArray.max())
}