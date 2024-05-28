fun main(args: Array<String>) {
    question31746()
}

fun question31746() {
    readln().toInt().let {
        if(it % 2 == 1) {
            println("SciComLove".reversed())
        } else {
            println("SciComLove")
        }
    }
}