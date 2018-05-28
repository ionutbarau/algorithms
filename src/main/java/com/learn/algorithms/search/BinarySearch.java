package com.learn.algorithms.search;

import java.util.Arrays;

/**
 * In order to perform binary search the data should be sorted.
 * The search itself will get the middle element and compare with with "x".
 * If they are unequal than the half in which cannot be present is eliminated, the search continuing in the other half.
 *
 * Created by ionut on 5/28/2018.
 */
public class BinarySearch {

    /**
     * Do the binary search.
     *
     * @param data
     * @param lower (lower limit)
     * @param upper (upper limit)
     * @param x
     * @return the index where "x" can be found or -1 if it cannot be found at all
     */
    public static int doSearch(Integer[] data, int lower, int upper, int x){

        int middle=(lower + upper) / 2;

        //return -1 if the lower limit is higher than upper limit (wrong parameters)
        if(upper < lower){
            return -1;
        }

        if(x == data[middle]){
            return middle;
        }else if(x < data[middle]){
            //start searching in the lower end by making the upper limit middle - 1
            return doSearch(data, lower, middle-1, x);
        }else{
            //start searching in the upper end by making the lower limit middle + 1
            return doSearch(data, middle+1, upper, x);
        }
    }

}
