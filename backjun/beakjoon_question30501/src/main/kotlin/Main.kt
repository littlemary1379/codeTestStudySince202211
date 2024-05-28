fun main(args: Array<String>) {
    question30501()
}

fun question30501() {
    val people = readln().toInt()
    for(i in 1 .. people) {
        readln().let {
            if(it.contains('S')) {
                println(it)
            }
        }
    }
}