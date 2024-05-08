fun main(args: Array<String>) {
    question6810()
}

fun question6810() {
    var isbn = "9780921418"
    while (isbn.count() < 13) {
        isbn += readln()
    }

    var addAll = 0
    isbn.forEachIndexed { index, c ->
         addAll += if(index % 2 != 0) {
             c.toString().toInt() * 3
         } else {
             c.toString().toInt()
         }
    }

    println("The 1-3-sum is $addAll")


}