fun main(args: Array<String>) {
    question27310()
}

fun question27310() {
    readln().let { word ->
        println(word.count() + word.count { it == ':' } + (word.count { it == '_' } * 5))
    }
}