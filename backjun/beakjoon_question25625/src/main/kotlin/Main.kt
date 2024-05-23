fun main(args: Array<String>) {
    question25625()
}

fun question25625() {
    val busTime = readln().split(" ").map { it.toInt() }.let {
        // it[0] 시간이 편도로 걸리는데 it[1]이 크거나 같다면, 아직 입구역에 오지도 못했거나, 도착해있을 것.
        if(it[0] <= it[1]) {
            println(it[1] - it[0])
        } else {
            println(it[1] + it[0])
        }
    }
}