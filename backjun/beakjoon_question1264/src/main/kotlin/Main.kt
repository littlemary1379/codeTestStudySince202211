fun main(args: Array<String>) {
    question1264()
}

fun question1264() {
    while (true) {
        val sentence = readln().lowercase()
        if(sentence == "#") {
            break
        } else {
            println(sentence.count { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' })
        }
    }
}