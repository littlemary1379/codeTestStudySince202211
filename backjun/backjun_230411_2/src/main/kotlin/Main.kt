import java.util.Scanner

fun main(args: Array<String>) {
    question10950()
}

fun question10950() {
    var sc = Scanner(System.`in`)
    var case = sc.nextInt()
    var count = 1

    sc.nextLine()

    while (count <= case) {
        var numbers = sc.nextLine().split(" ").map { it.toInt() }
        println(numbers[0] + numbers[1])

        count += 1
    }
}