fun main(args: Array<String>) {
    question1427()
}

fun question1427() {
    var number = readln()
    println(number.toCharArray().sortedDescending().joinToString(""))
}