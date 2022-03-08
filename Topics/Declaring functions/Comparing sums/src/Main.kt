
// write your function here
fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int): Boolean {
    var isGreaterSum = false

    if (number1 + number2 > number3 + number4) {
        isGreaterSum = true
    }
    return isGreaterSum
}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}
