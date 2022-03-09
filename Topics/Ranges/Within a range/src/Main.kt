fun main() {
    // write your code here
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()
    val number5 = readLine()!!.toInt()

    val range12 = number1..number2
    val range34 = number3..number4
    val isNum5InRange = number5 in range12 || number5 in range34
    println(isNum5InRange)
}
