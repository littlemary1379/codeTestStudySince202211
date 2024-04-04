import java.util.Stack

fun main(args: Array<String>) {
    question12789()
}

fun question12789() {
    var count = readln().toInt()
    var order = 1
    var person = readln().split(" ").map { it.toInt() }.toMutableList()
    var corrStack = Stack<Int>()

    while (person.isNotEmpty()) {
        if(person[0] == order) {
            order += 1
            person.removeAt(0)
        } else {
            if(corrStack.isNotEmpty() && corrStack.peek() == order) {
                corrStack.pop()
                order += 1
            } else {
                corrStack.push(person[0])
                person.removeAt(0)
            }
        }
    }

    while (corrStack.isNotEmpty()) {
        if(corrStack.pop() == order) {
            order += 1
        } else {
            println("Sad")
            return
        }
    }

    println("Nice")

}

