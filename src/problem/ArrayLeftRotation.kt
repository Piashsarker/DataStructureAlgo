package problem

/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

/**
 * array is [1,2,3,4,5]
 * rotation D = 2
 * result = [3,4,5,1,2]
 *
 * count = 5
 * d = 2
 * i = 0
 * array[i]  = array[(i+d)%n]
 *
 *
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int?> {
    // Write your code here
    val tempArray = arrayOfNulls<Int>(a.size)
    for (i in a.indices) {
        tempArray[i] = a[(i + d) % a.size]
    }
    return tempArray

}

fun main(args: Array<String>) {

    val array : Array<Int> = arrayOf(1,2,3,4,5)
    val result = rotLeft(array, 2)

    println(result.joinToString(" "))
}
