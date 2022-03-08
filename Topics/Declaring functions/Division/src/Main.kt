
// write your code here
fun divide(number1: Long, number2: Long): Double {
    var result = 0.0
    val doubleNumber1 = number1.toDouble()
    val doubleNumber2 = number2.toDouble()

    if (doubleNumber2 != 0.0) {
        result = doubleNumber1 / doubleNumber2
    }
    return result
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}