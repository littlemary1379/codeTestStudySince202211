fun main(args: Array<String>) {
    question2798()
}

fun question2798() {
    var count = readln().split(" ").map { it.toInt() }
    var cards = readln().split(" ").map { it.toInt() }

    var upperSum = 0

    for(i in 0..< cards.count()) {
        for(j in 0 ..< cards.count()) {
            if(i == j) continue
            for (k in 0 ..< cards.count()) {
                if(i == k || j == k ) continue
                var sum = cards[i] + cards[j] + cards[k]
                if(sum > upperSum && sum <= count[1]) {
                    upperSum = cards[i] + cards[j] + cards[k]
                }
            }
        }
    }

    println(upperSum)
}