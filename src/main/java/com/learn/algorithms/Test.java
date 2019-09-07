package com.learn.algorithms;

import com.learn.algorithms.sort.QuickSort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: algorithms
 * Date: 02/10/2018.
 * Time: 21:04
 */
public class Test {

    public static Integer[] data = new Integer[]{14,11,22,33,67,34,70,99,250,101,300, 312};
    public static Integer[] sortedData = new Integer[]{11,14,22,33,34,67,70,99,101,250,300};

    public static void main(String[] args){
        //2. Binary search
        System.out.println("== Binary search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = "+ x +" found through Binary Search at position : " + binarySearch(Arrays.asList(sortedData), 0,sortedData.length-1,x)));

        //7. Quick sort
        System.out.println("=== Quick sort ===");
        System.out.println(quickSort(Arrays.asList(data)));

        //7. Merge sort
        System.out.println("=== Merge sort ===");
        System.out.println(mergeSort(Arrays.asList(data)));

    }


    public static int binarySearch(List<Integer> data, int lower, int upper, int x){
        if(data.size() == 0){
            return -1;
        }

        if(lower > upper){
            return -1;
        }

        int middle = (lower + upper) / 2;

        if(x == data.get(middle)){
            return middle;
        }else if(x < data.get(middle)){
            return binarySearch(data, lower, middle -1,x);
        }else {
            return binarySearch(data, middle+1, upper,x);
        }

    }


    public static List<Integer> quickSort(List<Integer> data){
        if(data.size() < 2){
            return data;
        }

        int pivot = data.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 1; i<data.size(); i++){
            if(data.get(i) > pivot){
                right.add(data.get(i));
            }else {
                left.add(data.get(i));
            }
        }

        List<Integer> sorted = quickSort(left);

        sorted.add(pivot);

        sorted.addAll(quickSort(right));

        return sorted;

    }


    public static List<Integer> mergeSort(List<Integer> data){
        if(data.size() < 2){
            return data;
        }

        List<Integer> left = data.subList(0, data.size()/2);
        List<Integer> right = data.subList(data.size()/2, data.size());

        return merge(mergeSort(left), mergeSort(right));

    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right){
        int leftPtr = 0;
        int rightPtr = 0;

        List<Integer> merged = new ArrayList<>(left.size() + right.size());

        while (leftPtr < left.size() && rightPtr < right.size()){
            if(left.get(leftPtr) < right.get(rightPtr)){
                merged.add(left.get(leftPtr));
                leftPtr++;
            }else{
                merged.add(right.get(rightPtr));
                rightPtr++;
            }
        }

        while(leftPtr < left.size()){
            merged.add(left.get(leftPtr));
            leftPtr++;
        }

        while(rightPtr < right.size()){
            merged.add(right.get(rightPtr));
            rightPtr++;
        }

        return merged;
    }


}


