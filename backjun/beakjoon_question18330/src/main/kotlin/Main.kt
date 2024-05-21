fun main(args: Array<String>) {
    question18330()
}

fun question18330() {
    val useLiter = readln().toInt()
    val nextLiter = readln().toInt()

    if(useLiter <= (60 + nextLiter)) {
        println(useLiter * 1500)
    } else {
        println((60 + nextLiter) * 1500 + (useLiter - 60 - nextLiter) * 3000)
    }

}