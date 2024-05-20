fun main(args: Array<String>) {
    question17548()
}

fun question17548() {
    val sentence = readln()
    println("h${"e".repeat(sentence.substring(1 .. sentence.length - 2).length * 2)}y")
}