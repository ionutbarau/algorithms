package com.learn.algorithms.sort;

import java.util.LinkedList;
import java.util.List;

/**
 * It builds the final sorted array one item at a time.
 * It returns a new list.
 * Insertion sort iterates through the list by consuming one input element at each repetition,
 * and growing a sorted output list. On a repetition, insertion sort gets one element from the input data,
 * finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.
 * Worst case scenario (when the list is already sorted) has O(n ^2) complexity because it will iterate on the second for loop until the end.
 * Best case scenario (when the list is sorted in reverse order) has O(n) complexity because
 * insertion will happen at the head of the list.
 * Uses twice as much space than bubble sort
 * An advantage over bubble sort is that it does not have redundant cycles to check if the list is in order.
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 29/09/2018.
 * Time: 12:18
 */
public class InsertionSort {

    public static List<Integer> doSort(List<Integer> originalList){
        //use a linked list because it is faster for insertions in the middle of the list
        List<Integer> sortedList = new LinkedList<>();

        original : for(Integer n : originalList){
            for(int i=0; i<sortedList.size();i++){
                if(n < sortedList.get(i)){
                    //add to the list at the head(start) position
                    sortedList.add(i, n);
                    //continue with the next number from original list
                    continue original;
                }
            }
            //add at the tail(end) of the list
            sortedList.add(sortedList.size(), n);
        }

        return sortedList;
    }
}
