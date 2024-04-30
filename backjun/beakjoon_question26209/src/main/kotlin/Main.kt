fun main(args: Array<String>) {
    question26209()
}

fun question26209() {
    val code = readln().split(" ")
    println(if(code.contains("9")) "F" else "S")
}