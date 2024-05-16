fun main(args: Array<String>) {
    question13985()
}

fun question13985() {
    val math = readln().split("+", "=").map { it.trim().toInt() }
    println(if(math[0] + math[1] == math[2]) "YES" else "NO")
}