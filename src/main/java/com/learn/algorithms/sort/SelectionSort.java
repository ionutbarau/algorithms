package com.learn.algorithms.sort;

/**
 * Divides the array into sorted and unsorted partition like bubble sort.
 * On each iteration it compares the elements and it selects the largest item and moves it to the right (the sorted partition).
 * It swaps the largest item with the element at lastUnsortedIndex
 * It is an in place algorithm(does not generate another array).
 * It is an unstable algorithm
 * Has time complexity O(n^2)
 * Does not require as much swapping as bubble sort.
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 2019-09-09.
 * Time: 22:10
 */
public class SelectionSort {


    /**
     *   lastUnsortedIndex  = the last index of the unsorted partition (is the rightmost element at the beginning)
     *   i = index used to traverse the array from left to right (starts from 1 because we choose 0 the largest)
     *   largest = index of the largest element in the unsorted partition (starts from 0)
     *   At the beginning the whole array is an unsorted partition.
     *   While traversing the sorted partition will be on the right.
     *   The first loop goes from right to left and at the end of each iteration does the swap between the lastUnsortedIndex
     *   and the largest number's index, essentially moving the sorted parts to the right.
     *   The second loop finds the largest element at each traversal.
     * @param data
     */
    public static void doSort(Integer[] data) {

        //go from right to left
        for(int lastUnsortedIndex = data.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            //at each iteration reset the largest to 0
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(data[i] > data[largest]){
                    largest = i;
                }
            }

            BubbleSort.swap(data, largest, lastUnsortedIndex);
        }
    }


}
