fun main(args: Array<String>) {
    question31450()
}

fun question31450() {
    val price = readln().split(" ").map { it.toInt() }
    println(if(price[0] % price[1] == 0) "Yes" else "No")
}