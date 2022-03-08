
// write your function here
fun isVowel(letter: Char): Boolean {
    val lowerCaseLetter = letter.lowercaseChar()
    var isVowel = false

    if (lowerCaseLetter == 'a' ||
        lowerCaseLetter == 'e' ||
        lowerCaseLetter == 'i' ||
        lowerCaseLetter == 'o' ||
        lowerCaseLetter == 'u'
    ) {
        isVowel = true
    }
    return isVowel
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
