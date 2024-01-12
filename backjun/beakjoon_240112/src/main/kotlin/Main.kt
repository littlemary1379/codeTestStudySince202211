import kotlin.math.pow

fun main(args: Array<String>) {
    question24264()
}

fun question24264() {

//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n
//           for j <- 1 to n
//              sum <- sum + A[i] × A[j]; # 코드1
//        return sum;
//    }

    // 반복문 안의 반복문 구절이다
    // 즉 2번 하면 1번 내에서 2번.. 2번 내에서 2번.. 총 4번을 돌고
    // 3번 하면 1에서 3, 2에서 3, 3에서 3.. 총 9번을 돈다. 즉 n^2의 횟수만큼 시행된다.
    // 따라서 빅오표기법은 O(n^2) 이기 때문에 최고차항은 2가 된다.

    val count = readln().toInt()

    println((count.toDouble().pow(2.0)).toLong().toString())
    println("2")

}