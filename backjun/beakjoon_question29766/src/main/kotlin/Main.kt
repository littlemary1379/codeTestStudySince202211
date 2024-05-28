fun main(args: Array<String>) {
    question29766()
}

fun question29766() {
    val sentence = readln()
    var count = 0
    for(i in 0 .. sentence.length - 4) {
        if(sentence[i] == 'D') {
            if(sentence[i + 1] == 'K' && sentence[i + 2] == 'S' && sentence[i + 3] == 'H') {
                count++
            }
        }
    }

    println(count)
}