import java.util.Arrays
import java.util.ArrayList

fun main(args: Array<String>) {
    var sizes = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
    println(solution2(sizes))
}

fun solution(sizes: Array<IntArray>) : Int {

    var width = 0
    var height = 0

    for (arrayItem in sizes) {
        Arrays.sort(arrayItem)
        arrayItem.max()
        if(width < arrayItem[1]) {
            width = arrayItem[1]
        }

        if(height < arrayItem[0]) {
            height = arrayItem[0]
        }
    }

    println(width)
    println(height)

    return width * height
}

fun solution2(sizes: Array<IntArray>) : Int {

    var widthArray = ArrayList<Int>()
    var heightArray = ArrayList<Int>()

    for (arrayItem in sizes) {
        Arrays.sort(arrayItem)
        widthArray.add(arrayItem[1])
        heightArray.add(arrayItem[0])
    }

    println(widthArray.max())
    println(heightArray.max())

    return widthArray.max() * heightArray.max()
}