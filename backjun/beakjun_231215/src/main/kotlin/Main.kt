import kotlin.math.ceil

fun main(args: Array<String>) {
    question2869()
}

fun question2869() {

    // 예시 2 1 5 -> 4
    // 예시 5 1 6 -> 2
    // 예시 100 99 1000000000 -> 999999901

    // 올라가는 높이, 미끄러지는 높이, 나무의 높이
    var data = readln().split(" ").map { it.toDouble() }

    var day = 0.0

    // 전체 높이에서 올라갸야하는 높이를 선으로 빼고, day에 1을 추가
    // 나머지는 내려가는 날이므로, 해당 날짜를 구하기. float로 구하고, 올림으로 처리.
    day += 1
    var height = (data[2] - data[0])

    day += ceil(height / (data[0] - data[1])).toInt()

    println("${day.toInt()}")

    // 시간초과

//    var day = 0
//    while (true) {
//        day += 1
//        if((data[0] * day - data[1] * (day - 1)) >= data[2] ) {
//            // 정상 도착
//            break
//        }
//    }
//
//    println(day)

}