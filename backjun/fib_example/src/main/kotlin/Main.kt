fun main(args: Array<String>) {

    // 32, 51, 72 번째의 피보나치 수열을 구한다.
    // 메모
    val memoArray = arrayOf(memo(32), memo(51), memo(72))
    val tabArray = tab(arrayOf(32, 51, 72))
}

// 메모이제이션
fun memo(number : Int) : Int{
    // 값을 저장하는 배열 =
    val array = Array(number) {0}

    for(i in 0 .. number) {
        when(i) {
            0, 1 -> array[i] = 1
            else -> array[i] = array[i - 1] + array[i - 2]
        }
    }

    return array[number]
}

// 태뷸레이션
fun tab(list : Array<Int>) : Array<Int> {

    val array = Array(list.size) {0}
    val pib = Array(100) {1}

    for(i in 2 ..< pib.size) {
        pib[i] = pib[i - 1] + pib[i - 2]
    }

    for(j in 0 ..< list.count()) {
        array[j] = pib[j]
    }

    return array
}