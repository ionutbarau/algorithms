package com.learn.algorithms.search;

/**
 * In order to perform jump search the data should be sorted.
 * The idea is to check fewer elements than linear search,
 * by jumping ahead by fixed steps or skipping some elements instead of searching all of them.
 * Created by ionut on 5/28/2018.
 */
public class JumpSearch {

    public static int doSearch(Integer[] data, int x){

        int length = data.length;
        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(length));
        int prev = 0;

        // Finding the block where element is
        // present (if it is present)
        while(data[Math.min(step, length)-1] < x){
            prev = step;
            step += (int) Math.floor(Math.sqrt(length));
            if(prev >= length){
                return -1;
            }
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (data[prev] < x){
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if(prev == Math.min(step, length)){
                return -1;
            }
        }

        // If element is found
        if(data[prev] == x){
            return prev;
        }


        return -1;
    }
}
