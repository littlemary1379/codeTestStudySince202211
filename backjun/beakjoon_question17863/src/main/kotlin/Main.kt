fun main(args: Array<String>) {
    question17863()
}

fun question17863() {
    val telephone = readln()
    println(if(telephone.substring(0 .. 2) == "555") {
        "YES"
    } else {
        "NO"
    })
}