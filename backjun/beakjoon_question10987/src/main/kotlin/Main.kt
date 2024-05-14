fun main(args: Array<String>) {
    question10987()
}

fun question10987() {
    val word = readln()
    println(word.count { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' })
}