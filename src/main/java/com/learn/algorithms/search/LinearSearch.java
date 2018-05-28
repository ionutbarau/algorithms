package com.learn.algorithms.search;

/**
 * Starts from the leftmost element of the array and one by one compare "x"  with each element of the array.
 * If "x" matches with the element, return the index. If "x" does not match with any of the elements return -1.
 * It is rarely used because other search algorithms are faster (binary search, hash tables)
 *
 * Created by ionut on 5/28/2018.
 */
public class LinearSearch {

    /**
     * Do the linear search.
     *
     * @param data
     * @param x
     * @return the index where "x" can be found or -1 if it cannot be found at all
     */
    public static int doSearch(Integer[] data, int x){
        for(int i = 0; i< data.length; i++){
            if(x == data[i]){
                return i;
            }
        }
        return -1;
    }
}
