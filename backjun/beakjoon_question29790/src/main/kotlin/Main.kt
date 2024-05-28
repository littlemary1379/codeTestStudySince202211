fun main(args: Array<String>) {
    question29790()
}

fun question29790() {
    readln().split(" ").map { it.toInt() }.let {
        if(it[0] >= 1000 && (it[1] >= 8000 || it[2] >= 260)) {
            println("Very Good")
        } else if(it[0] >= 1000) {
            println("Good")
        } else {
            println("Bad")
        }
    }
}