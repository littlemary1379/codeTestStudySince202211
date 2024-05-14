fun main(args: Array<String>) {
    question11121()
}

fun question11121() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        val bit = readln().trim().split(" ")
        println(if(bit[0] == bit[1]) "OK" else "ERROR")
    }
}