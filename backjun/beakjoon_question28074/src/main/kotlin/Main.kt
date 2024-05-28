fun main(args: Array<String>) {
    question28074()
}

fun question28074() {
    readln().let {
        if(it.contains('M') && it.contains('O') && it.contains('B')
            && it.contains('I') && it.contains('S')) {
            println("YES")
        } else {
            println("NO")
        }
    }
}