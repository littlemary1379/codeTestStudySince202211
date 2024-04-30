fun main(args: Array<String>) {
    question26489()
}

fun question26489() {

    var count = 0
    while (true) {
        var loud = readlnOrNull()
        if(loud.isNullOrEmpty()) {
            break
        } else {
            count++
        }
    }
    println(count)
}