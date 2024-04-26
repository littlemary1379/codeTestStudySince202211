fun main(args: Array<String>) {
    question5522()
}

fun question5522() {

    var add = 0

    for(i in 1 .. 5) {
        val number = readln().toInt()
        add += number
    }

    println(add)

}