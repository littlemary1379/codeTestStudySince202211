import java.util.*

fun main(args: Array<String>) {
    question11382()
}

fun question11382() {
    val sc: Scanner = Scanner(System.`in`)
    var scArrayString = sc.nextLine()

    var aArray = scArrayString.split(" ")
    var answer = 0.0

    aArray.forEach {
        answer += it.toDouble()
    }

    println(String.format("%.0f", answer))

}