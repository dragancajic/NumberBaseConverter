
// write your code here
fun isRightEquation(a: Int, b: Int, c: Int): Boolean {
    var isProductEqualC = false

    if (a * b == c) {
        isProductEqualC = true
    }
    return isProductEqualC
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}
