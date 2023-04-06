import java.util.*

fun main(args: Array<String>) {
    question9498()
}

fun question9498() {
    val sc: Scanner = Scanner(System.`in`)

    when(sc.nextInt()) {
        in 90 .. 100 -> println("A")
        in 80 .. 89 -> println("B")
        in 70 .. 79 -> println("C")
        in 60 .. 69 -> println("D")
        else -> println("F")
    }
}