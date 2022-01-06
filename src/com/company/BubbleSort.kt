package com.company

class BubbleSort {

    fun sort(array: IntArray): IntArray {
        for (i in 0 until array.size - 1) {
            for(j in 0 until array.size-1-i){
                if(array[j] > array[j+1]){
                    var temp = array[j+1]
                    array[j+1] = array[j]
                    array[j] = temp
                }
            }
        }
        return array
    }

}