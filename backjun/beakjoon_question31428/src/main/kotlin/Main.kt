fun main(args: Array<String>) {
    question31428()
}

fun question31428() {
    val count = readln().toInt()
    readln().split(" ").let {
        val hellobit = readln()
        println(it.count { track -> track == hellobit })
    }
}