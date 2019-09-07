package com.learn.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * It is recursive.
 * If the list has 0 or 1 elements than it is returned as is.
 * If it has more than 1, than an arbitrary element is picked and 2 lists are created. One that will hold values lower than
 * the element, and one that will hold the values that are higher. The method will then be called recursively for each list.
 * The final list is composed of the sorted lower end, the pivot and the sorted higher end.
 * It is more efficient than bubble and insertion sort.
 * The worst case is O(n ^2).
 * The average case is O(n log n).
 * The choice of the pivot makes a difference.
 * It is considered the best performing for most inputs.
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 29/09/2018.
 * Time: 14:28
 */
public class QuickSort {

    public static List<Integer> doSort(List<Integer> data){
        //if the list has at max 1 element return as is
        if(data.size() < 2){
            return data;
        }
        final Integer pivot = data.get(0);
        final List<Integer> lower = new ArrayList<>();
        final List<Integer> higher = new ArrayList<>();
        for(int i=1; i< data.size() ; i++){
            //distribute the values accordingly
            Integer currentVal = data.get(i);
            if(currentVal > pivot){
                higher.add(currentVal);
            }else{
                lower.add(currentVal);
            }
        }

        //add the lower end sorted
        final List<Integer> sortedList = doSort(lower);
        //add the pivot
        sortedList.add(pivot);
        //add the higher end sorted
        sortedList.addAll(doSort(higher));

        return sortedList;
    }
}
