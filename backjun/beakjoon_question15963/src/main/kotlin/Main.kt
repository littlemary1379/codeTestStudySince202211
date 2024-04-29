fun main(args: Array<String>) {
    question15963()
}

fun question15963() {
    val batterys = readln().split(" ")
    println(if(batterys[0] == batterys[1]) 1 else 0 )
}