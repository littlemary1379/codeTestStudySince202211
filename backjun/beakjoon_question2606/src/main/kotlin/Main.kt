import java.util.Stack

fun main(args: Array<String>) {
    question2606()
}

fun question2606() {
    val computer = readln().toInt()
    // 0번 컴퓨터는 계산 편하라고 넣은 거임!!;;
    val nodeCount = readln().toInt()
    val graph = mutableListOf<List<Int>>()
    val computerVisited = Array(computer + 1) { false }
    val stack = Stack<Int>()


    for (i in 1 .. nodeCount) {
        val node = readln().split(" ").map { it.toInt() }
        graph.add(node)
    }

    // 1번 컴퓨터와 인접한 노드가 없다면 바로 1개 리턴 해야함..
    if(graph.count { it[0] == 1 || it[1] == 1} == 0) {
        println(0)
    } else {
        stack.push(1)
        computerVisited[1] = true

        while (!stack.empty()) {
            println(stack)
            val nodeIndex = stack.pop()
            val nodeConnect = graph.filter { it[0] == nodeIndex || it[1] == nodeIndex }
            nodeConnect.forEach {
                val destination = it.filter { it != nodeIndex }[0]
                if(!computerVisited[destination]) {
                    stack.push(destination)
                    computerVisited[destination] = true
                }
            }
        }
        println(computerVisited.count { it } - 1)

    }



}