fun main() {
    // write your code here
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val isBetween = number1 in number2..number3
    println(isBetween)
}
