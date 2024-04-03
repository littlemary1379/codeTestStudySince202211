import java.util.Stack

fun main(args: Array<String>) {
    question4949()
}

fun question4949() {
    loop@ while (true) {
        val sentence = readln()
        val stack = Stack<Char>()
        if(sentence == ".") {
            break
        } else {
            val filter = sentence.filter { it == '(' || it == ')' || it == '[' || it == ']' }
            for(i in 0 ..< filter.count()) {
                val char = filter[i]
                if(char == '(' || char == '[') {
                    stack.push(char)
                } else {

                    if(stack.isEmpty()) {
                        println("no")
                        continue@loop
                    }

                    if(char == ']') {
                        if(stack.pop() != '[') {
                            println("no")
                            continue@loop
                        }
                    } else if(char == ')') {
                        if(stack.pop() != '(') {
                            println("no")
                            continue@loop
                        }
                    }
                }
            }


            if(stack.isEmpty()) {
                println("yes")
            } else {
                println("no")
            }
        }
    }
}