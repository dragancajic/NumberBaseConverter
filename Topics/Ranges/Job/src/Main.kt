fun main() {
    // write your code here
    val age = readLine()!!.toInt()

    val activeAges = 18..59

    val canGetJob = age in activeAges
    println(canGetJob)
}
