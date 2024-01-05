fun main(args: Array<String>) {
    question15894()
}

fun question15894() {

    // 위에서 보면 아래랑 길이가 같고, 아래는 원래 도형의 크기이고, 받은 도형이 갯수가 곧 층이기 때문에 양변의 길이도 같다
    // 즉 * 4임 ..
    val square = readln().toLong()

    println("${(square * 4)}")
}