package com.company

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        val bubbleSort = BubbleSort()
        for (item in bubbleSort.sort(intArrayOf(10,32,33,30,3,4,44,43))) {
            print(item.toString() + "\t")
        }
    }
}