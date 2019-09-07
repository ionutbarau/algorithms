package com.learn.algorithms.sort;

/**
 * Swaps objects until is sorted.
 * It is inefficient because it has redundant cycles to check that the list is in order.
 * Worst case scenario (when the list is sorted in reverse order) has O(n ^2) complexity.
 * Best case scenario (when the list is already sorted) has O(n) complexity because it won't do any swap.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 29/09/2018.
 * Time: 11:14
 */
public class BubbleSort {


    public static void doSort(Integer[] data){
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                //do the swap
                if (data[i + 1] < data[i]) {
                    Integer tmp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = tmp;
                    swapped = true;
                }
            }
        }while (swapped);
    }
}
