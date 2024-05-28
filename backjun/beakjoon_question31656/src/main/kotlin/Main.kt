fun main(args: Array<String>) {
    question31656()
}

fun question31656() {
    val list = mutableListOf<String>()
    val sentance = readln()
    sentance.split(" ").forEach {
        val stringList = it.map { string -> string.toString() }.toMutableList()
        var letter = ""
        for(i in 0 ..< stringList.size) {
            if(stringList[i] != letter) {
                letter = stringList[i]
            } else {
                stringList[i] = "-"
            }
        }
        list.add(stringList.joinToString("").replace("-", ""))
    }

    var fixSentanse = list.filter { it.isNotEmpty() }.joinToString(" ")
    if(sentance.last() == ' ') {
        fixSentanse += " "
    }

    println(fixSentanse)
}