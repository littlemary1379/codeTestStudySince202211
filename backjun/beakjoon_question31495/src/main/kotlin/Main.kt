fun main(args: Array<String>) {
    question31495()
}

fun question31495() {
    readln().let {
        if((it.first() == '"' && it.last() == '"' && it.count() > 2)) {
            println(it.substring(1 ..< it.count() - 1))
        } else {
            println("CE")
        }
    }
}