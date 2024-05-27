fun main(args: Array<String>) {
    question26560()
}

fun question26560() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        readln().let {
            println(if(it.last() == '.') it else "$it.")
        }
    }
}