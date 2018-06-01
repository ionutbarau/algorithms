package com.learn.algorithms.search;

/**
 * In order to perform jump search the data should be sorted.
 * The idea is to check fewer elements than linear search,
 * by jumping ahead by fixed steps or skipping some elements instead of searching all of them.
 * Created by ionut on 5/28/2018.
 */
public class JumpSearch {

    public static int doSearchWithWhile(Integer[] data, int x){

        int length = data.length;
        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(length));
        //set the lower end
        int lower = 0;

        // Finding the block where element is
        // present (if it is present)
        // while the element at (step or length)-1 is lower than x
        // set the lower to be the step and double the step
        while(data[Math.min(step, length)-1] < x){
            lower = step;
            step += (int) Math.floor(Math.sqrt(length));
            if(lower >= length){
                return -1;
            }
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (data[lower] < x){
            lower++;

            // If we reached next block or end of
            // array, element is not present.
            if(lower == Math.min(step, length)){
                return -1;
            }
        }

        // If element is found
        if(data[lower] == x){
            return lower;
        }


        return -1;
    }

}
