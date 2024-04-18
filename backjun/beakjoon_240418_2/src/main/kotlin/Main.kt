import kotlin.math.pow

fun main(args: Array<String>) {
    question1037()
}

fun question1037() {

    val count = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }.sorted()

    if(count % 2 == 0) {
        //약수 갯수가 짝수일 경우 끝 단 곱하면 나올걸..?
        println("${list[0] * list[count - 1]}")
    } else {
        // 홀수일 경우 제곱값일거 같은데.. 중간값 제곱하면 나올거 같음..
        println("${list[count / 2].toDouble().pow(2.0).toInt()}")
    }

}