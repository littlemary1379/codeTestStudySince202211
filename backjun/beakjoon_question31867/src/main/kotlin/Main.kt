fun main(args: Array<String>) {
    question31867()
}

fun question31867() {
    val count = readln()
    var odd = 0
    var even = 0
    readln().forEach {
        if(it.toString().toInt() % 2 == 0) {
            even++
        } else {
            odd++
        }
    }

    println(if(odd > even) {
        1
    } else if(odd < even) {
        0
    } else {
        -1
    })
}