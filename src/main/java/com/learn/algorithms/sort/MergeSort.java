package com.learn.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Splits the list in 2 , sort each sub list and merge the 2 lists together.
 * Time complexity is O(n log n).
 * It is slower than QuickSort.
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 29/09/2018.
 * Time: 14:50
 */
public class MergeSort {

    public static List<Integer> doSort(List<Integer> data) {
        //if the list has at max 1 element
        if(data.size() < 2){
            return data;
        }
        //divide the list
        final List<Integer> leftHalf = data.subList(0,data.size()/2);
        final List<Integer> rightHalf = data.subList(data.size()/2, data.size());

        //merge the lists after they were sorted recursively
        return merge(doSort(leftHalf), doSort(rightHalf));
    }

    private static List<Integer> merge(final List<Integer> leftHalf, final List<Integer> rightHalf) {
        int leftPtr = 0;
        int rightPtr = 0;

        final List<Integer> merged = new ArrayList<>(leftHalf.size() + rightHalf.size());

        while (leftPtr < leftHalf.size() && rightPtr < rightHalf.size()){
            if(leftHalf.get(leftPtr) < rightHalf.get(rightPtr)){
                merged.add(leftHalf.get(leftPtr));
                leftPtr++;
            }else{
                merged.add(rightHalf.get(rightPtr));
                rightPtr++;
            }
        }

        //add the remaining elements from left part if it has more elements than right part
        while(leftPtr < leftHalf.size()){
            merged.add(leftHalf.get(leftPtr));
            leftPtr++;
        }

        //add the remaining elements from right part if it has more elements than left part
        while (rightPtr < rightHalf.size()){
            merged.add(rightHalf.get(rightPtr));
            rightPtr++;
        }


    return merged;
    }
}
