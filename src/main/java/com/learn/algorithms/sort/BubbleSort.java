package com.learn.algorithms.sort;

/**
 * Swaps objects until is sorted.
 * It is inefficient because it has redundant cycles to check that the list is in order.
 * Worst case scenario (when the list is sorted in reverse order) has O(n ^2) complexity.
 * Best case scenario (when the list is already sorted) has O(n) complexity because it won't do any swap.
 * It is an in place algorithm.
 * It is a stable algorithm.
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 29/09/2018.
 * Time: 11:14
 */
public class BubbleSort {


    public static void doSort1(Integer[] data){
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                //do the swap
                if (data[i + 1] < data[i]) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
        }while (swapped);
    }

    public static void doSort2(Integer[] arr){
        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex --){
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }
        }
    }


    public static void swap(Integer[] data, int i, int j){
        if(i == j){
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
