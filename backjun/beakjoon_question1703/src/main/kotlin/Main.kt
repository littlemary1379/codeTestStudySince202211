fun main(args: Array<String>) {
    question1703()
}

fun question1703() {
    while (true) {
        val case = readln()
        if(case == "0") {
            break
        } else {
            val tree = case.split(" ").map { it.toInt() }
            val year = tree[0]
            var branch = 0

            for(i in 1..< tree.size) {
                if(i % 2 == 1) {
                    // 자라난 생장점
                    if(i == 1) {
                        branch = tree[i]
                    } else {
                        branch *= tree[i]
                    }
                } else {
                    // 잘라낸 생장점
                    branch -= tree[i]
                }
            }

            println(branch)
        }
    }
}