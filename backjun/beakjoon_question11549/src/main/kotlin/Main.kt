fun main(args: Array<String>) {
    question11549()
}

fun question11549() {
    val correct = readln()
    print(readln().split(" ").count{ it == correct })
}