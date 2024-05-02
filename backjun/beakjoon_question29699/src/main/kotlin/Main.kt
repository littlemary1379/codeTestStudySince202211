fun main(args: Array<String>) {
    question29699()
}

fun question29699() {
    val sentence = "WelcomeToSMUPC"
    var cut = readln().toInt() % sentence.length
    if(cut == 0) cut = sentence.length

    println(sentence[cut - 1])

}