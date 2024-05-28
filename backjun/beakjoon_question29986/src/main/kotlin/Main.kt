fun main(args: Array<String>) {
    question29986()
}

fun question29986() {
    val height = readln().split(" ").map { it.toInt() }
    var count = 0
    readln().split(" ").map { it.toInt() }.forEach {
        if(height[1] >= it) {
            count++
        }
    }
    println(count)
}