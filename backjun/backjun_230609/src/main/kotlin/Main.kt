fun main(args: Array<String>) {
    question2941()
}

fun question2941() {
    var word = readLine()!!
    var croatian = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=" ,"z=")
    // 카운트
    var count = 0

    croatian.forEach {
        if(word.contains(it)) {
            while (true) {
                var index = word.indexOf(it)
                if(index == - 1) {
                    break
                } else {
                    count += 1
                    word = word.replaceFirst(it, " ")
                }
            }
        }
    }

    count += word.replace(" ", "").toCharArray().count()
    println(count)

}