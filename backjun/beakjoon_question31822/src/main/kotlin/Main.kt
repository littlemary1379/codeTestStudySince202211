fun main(args: Array<String>) {
    question31822()
}

fun question31822() {
    val subject = readln().substring(0 .. 4)

    val count = readln().toInt()
    var canRead = 0
    for(i in 1 .. count) {
        if(readln().substring(0 .. 4) == subject) {
            canRead++
        }
    }

    println(canRead)
}