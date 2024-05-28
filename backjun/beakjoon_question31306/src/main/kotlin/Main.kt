fun main(args: Array<String>) {
    question31306()
}

fun question31306() {
    readln().let {
        val aeiou = it.count { char -> char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' }
        val y = it.count { char -> char == 'y' }
        println("$aeiou ${aeiou + y}")
    }
}