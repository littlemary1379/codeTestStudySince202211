fun main(args: Array<String>) {
    question25372()
}

fun question25372() {
    val count = readln().toInt()

    for(i in 1 .. count) {
        val password = readln()
        if(password.count() > 9 || password.count() < 6) {
            println("no")
        } else {
            println("yes")
        }
    }
}