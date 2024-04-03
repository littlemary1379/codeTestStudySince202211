import java.util.Stack

fun main(args: Array<String>) {
    question9012()
}

fun question9012() {
    val count = readln().toInt()
    loop@ for (i in 1 .. count) {
        val stack = Stack<Char>()
        val strings = readln()
        for (j in 0 ..< strings.count()) {
            val string = strings[j]
            if(string == '(') {
                stack.push(string)
            } else {
                if(stack.isNotEmpty()) {
                    stack.pop()
                } else {
                    println("NO")
                    continue@loop
                }
            }
        }

        if(stack.empty()) {
            println("YES")
        } else {
            println("NO")
        }
    }
}