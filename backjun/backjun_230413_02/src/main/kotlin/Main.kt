import java.util.Scanner

fun main(args: Array<String>) {
    question25304()
}

fun question25304() {
    var sc = Scanner(System.`in`)
    var totalPrice = sc.nextLine().toInt()
    var realPrice = 0
    var case = sc.nextLine().toInt()

    while (case > 0) {
        var product = sc.nextLine().split(" ").map { it.toInt() }
        realPrice += (product[0] * product[1])
        case -= 1
    }

    println(if(totalPrice == realPrice) {
        "Yes"
    } else {
        "No"
    })
}