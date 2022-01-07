package problem

fun main(args: Array<String>) {
    var cinema = arrayOf<Array<Int>>()

     cinema = arrayOf(
            arrayOf(0, 0, 0, 0, 1),
            arrayOf(0, 0, 0, 1, 1),
            arrayOf(0, 0, 1, 1, 1),
            arrayOf(0, 0, 0, 1, 1),
            arrayOf(0, 0, 0, 0, 1)
    )
    cinema[1][0] = 1
    println(cinema[1][0])

    for ( array in cinema){
        for(value in array){
            print(""+value +"\t")
        }
        println()
    }

}