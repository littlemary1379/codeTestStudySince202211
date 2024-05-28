fun main(args: Array<String>) {
    question31518()
}

fun question31518() {
    val count = readln()
    for(i in 1 .. 3) {
        if(readln().split(" ").count { it == "7" } == 0) {
            println(0)
            return
        }
    }

    println("777")
}