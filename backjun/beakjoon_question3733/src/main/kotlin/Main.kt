fun main(args: Array<String>) {
    question3733()
}

fun question3733() {
    while (true) {
        val case = readlnOrNull()
        if(case.isNullOrEmpty()) {
            break
        } else {
            case.split(" ").map { it.toInt() }.apply {
                println(this[1] / (this[0] + 1))
            }
        }
    }
}