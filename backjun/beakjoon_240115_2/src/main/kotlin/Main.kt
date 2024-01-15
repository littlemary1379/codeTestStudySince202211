import kotlin.math.pow

fun main(args: Array<String>) {
    question24266()
}

fun question24266() {

    var count = readln().toLong()

    // 큰 수 일때, 오차가 존재하므로 Math.pow() 보다 직접 곱하는 형식 채택
    println(count * count * count)
    println(3)

}

fun testPession() {

    var count = readln().toLong()
    var repeat = 0

    for (i in 1 .. count) {
        for (j in 1 .. count) {
            for (k in 1 ..count) {
                repeat += 1
            }
        }
    }

    println(repeat)
}