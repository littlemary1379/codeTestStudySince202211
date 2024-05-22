fun main(args: Array<String>) {
    question21631()
}

fun question21631() {
    val checker = readln().split(" ").map { it.toLong() }
    if(checker[0] + 1 >= checker[1]) {
        println(checker[1])
    } else {
        println(checker[0] + 1)
    }
}