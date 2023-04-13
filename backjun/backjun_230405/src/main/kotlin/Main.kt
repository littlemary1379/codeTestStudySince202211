import java.util.*

fun main(args: Array<String>) {
    question1330()
}

fun question1330() {
    val sc: Scanner = Scanner(System.`in`)
    var scArrayString = sc.nextLine()

    var scArray = scArrayString.split(" ")

    when(scArray[0].toInt().compareTo(scArray[1].toInt())) {
        1 -> println(">")
        0 -> println("==")
        -1 -> println("<")
    }
}