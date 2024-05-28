fun main(args: Array<String>) {
    question28248()
}

fun question28248() {
    val pack = readln().toInt()
    val boom = readln().toInt()
    println(pack * 50 - boom * 10 + if(pack > boom) 500 else 0)
}