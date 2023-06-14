fun main(args: Array<String>) {
    question1316()
}

fun question1316() {
    var case = readLine()!!.toInt()
    var count = 0
    for (i in 1 .. case) {
        var word = readLine()!!

        var newWord = ""
        for(j in word.indices) {
            if(j == 0) {
                newWord += word[j]
            } else {
                if(word[j] == newWord.trim().last()) {
                    newWord += " "
                } else {
                    newWord += word[j]
                }
            }
        }

        if(newWord.replace(" ","").length == word.toCharArray().distinct().count()) {
            count += 1
        }
    }

    println(count)
}