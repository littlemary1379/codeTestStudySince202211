fun main(args: Array<String>) {
    question10808()
}

fun question10808() {
    val word = readln()
    for(i in 97 .. 122) {
        print("${word.count { it.code == i }} ")
    }
}