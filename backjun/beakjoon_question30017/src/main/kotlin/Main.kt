fun main(args: Array<String>) {
    question30017()
}

fun question30017() {
    val petties = readln().split(" ").map { it.toInt() }.let {
        if(it[0] - 1 < it[1]) {
            // 치즈가 많음 => 패티에게 맞춰서 제작하면 됨
            println(it[0] * 2 - 1)
        } else {
            // 패티가 많음 => 치즈에 맞춰서 제작하면 됨
            println(it[1] * 2 + 1)
        }
    }
}