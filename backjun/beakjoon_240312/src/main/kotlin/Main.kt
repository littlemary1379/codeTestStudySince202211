fun main(args: Array<String>) {
    question2751()
}

fun question2751() {
    val count = readln().toInt()
    val array = Array<Int>(count) { 0 }
    for (i in 1 .. count) {
        array[i - 1] = readln().toInt()
    }

    println(array.sorted().joinToString(separator = "\n"))

}
