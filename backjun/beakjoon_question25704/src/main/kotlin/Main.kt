fun main(args: Array<String>) {
    question25704()
}

fun question25704() {
    val coupon = readln().toInt()
    val price = readln().toInt()
    val saleList = mutableListOf<Int>()

    saleList.add(price)

    if(coupon >= 5) {
        saleList.add(price - 500)
    }

    if(coupon >= 10) {
        saleList.add(price / 100 * 90)
    }

    if(coupon >= 15) {
        saleList.add(price - 2000)
    }

    if(coupon >= 20) {
        saleList.add(price / 100 * 75)
    }

    println(if(saleList.min() < 0) {
        0
    } else {
        saleList.min()
    })
}