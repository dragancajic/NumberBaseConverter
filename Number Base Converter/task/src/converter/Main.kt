package converter

fun main() {
    // TODO Refactor code to appropriate functions! ;-)
    print("Enter number in decimal system: ")
    var number10 = readLine()!!.toInt()
    print("Enter target base: ")
    val targetBase = readLine()!!.toInt()

    var result = ""

    while (number10 > 0) {
        val remainder = number10 % targetBase

        // conversion from decimal to hexadecimal (A, B, C, D, E, F)
        // 'Assignment' can be lifted out of 'if'
        /*
        if (targetBase == 16 && remainder > 9) {
            result += convert10To15ToHex(remainder)
        } else {
            result += remainder.toString()
        }
        */
        result += if (targetBase == 16 && remainder > 9) {
            convert10To15ToHex(remainder)
        } else {
            remainder.toString()
        }

        number10 /= targetBase
        // println("result: $result") // <--- test --->
        // println("quotient, remainder: $number10, $remainder")
    }

    // implement reversed() function on your own :-)
    // { Returns a string with characters in reversed order. }
    fun reverseString(result: String): String {
        var i = 0
        var reversed = ""
        while (i < result.length) {
            reversed += result[(result.length - 1) - i]
            i++
        }
        return reversed
    }

    println("Conversion result: ${reverseString(result)}")
    // println("Conversion result: ${result.reversed()}")
}

fun convert10To15ToHex(digit10To15: Int): String {
    var hexDigitAsString = ""

    hexDigitAsString = when (digit10To15) {
        10 -> {
            "A"
        }
        11 -> {
            "B"
        }
        12 -> {
            "C"
        }
        13 -> {
            "D"
        }
        14 -> {
            "E"
        }
        else -> {
            "F"
        }
    }
    return hexDigitAsString
}
