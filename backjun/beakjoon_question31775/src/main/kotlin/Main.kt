fun main(args: Array<String>) {
    question31775()
}

fun question31775() {
    var global = mutableListOf('l', 'k', 'p')
    for (i in 1..3) {
        val sentance = readln()[0]
        if (global.contains(sentance)) {
            global.remove(sentance)
        }
    }

    println(
        if (global.isEmpty()) {
            "GLOBAL"
        } else {
            "PONIX"
        }
    )
}