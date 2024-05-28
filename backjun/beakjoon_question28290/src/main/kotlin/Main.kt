fun main(args: Array<String>) {
    question28290()
}

fun question28290() {
    println(when (readln()) {
        "fdsajkl;", "jkl;fdsa" -> "in-out"
        "asdf;lkj", ";lkjasdf" -> "out-in"
        "asdfjkl;" -> "stairs"
        ";lkjfdsa" -> "reverse"
        else -> "molu"
    })
}