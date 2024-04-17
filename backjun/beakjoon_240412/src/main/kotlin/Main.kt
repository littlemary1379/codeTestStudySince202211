fun main(args: Array<String>) {
    question1920()
}

fun question1920() {
    val listCount = readln().toInt()
    val list = readln().split(" ").toHashSet()
    val findCount = readln().toInt()
    val findList = readln().split(" ")

    val stringBuilder = StringBuilder()

    findList.forEach {
        stringBuilder.append("${if(list.contains(it)) 1 else 0}\n")
    }

    println(stringBuilder)
}