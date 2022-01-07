package problem

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */



/**
'abcac' -> total a in string 2
n -> 10
divider = n/L = 10/5 = 2
remainder = 10%5 = 0
count = 2
remaindercount = 0
 totalcount = count * divider + remainderCount
 **/

fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    var count: Long = 0
    val divider: Long = n / s.length
    val remainder = n % s.length
    val totalCountInString = getTotalCharCount(s, 'a', s.length)
    val totalCountInRemainder = getTotalCharCount(s, 'a', remainder.toInt())

    count = totalCountInString * divider + totalCountInRemainder
    return count

}

fun getTotalCharCount(text: String, char: Char, limit: Int): Int {
    var count = 0
    for (i in 0 until limit) {
        if (text[i] == 'a') {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}