fun main(args: Array<String>) {
    question20499()
}

fun question20499() {
    var kda = readln().split("/").map { it.toInt() }
    println(if(kda[0] + kda[2] < kda[1] || kda[1] == 0) "hasu" else "gosu")
}