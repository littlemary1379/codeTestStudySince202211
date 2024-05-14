fun main(args: Array<String>) {
    question11365()
}

fun question11365() {
    while (true) {
        val sentense = readln()
        if(sentense == "END") {
            break
        } else {
            println(sentense.reversed())
        }
    }
}