import java.util.*

fun main(args: Array<String>) {
    question2588()
}

fun question2588() {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    var bClone = b

    while (b > 0) {
        println(a * (b % 10))
        b /= 10
    }

    println(a*bClone)

}