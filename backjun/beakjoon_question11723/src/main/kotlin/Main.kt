fun main(args: Array<String>) {
    question11723()
}

fun question11723() {
    val count = readln().toInt()
    val list = hashSetOf<String>()
    val stringBuilder = StringBuilder()

    for (i in 1 .. count) {
        val sentence = readln().split(" ")
        when(sentence[0]) {
            "add" -> {
                list.add(sentence[1])
            }

            "remove" -> {
                list.remove(sentence[1])
            }

            "check" -> {
                stringBuilder.append(if(list.contains(sentence[1])) {
                    "1"
                } else {
                    "0"
                })
                stringBuilder.append("\n")
            }

            "toggle" -> {
                if(list.contains(sentence[1])) {
                    list.remove(sentence[1])
                } else {
                    list.add(sentence[1])
                }
            }

            "all" -> {
                val newList = MutableList(20) { (it + 1).toString() }
                list.clear()
                list.addAll(newList)
            }

            "empty" -> {
                list.clear()
            }

            else -> {}
        }
    }

    println(stringBuilder)
}