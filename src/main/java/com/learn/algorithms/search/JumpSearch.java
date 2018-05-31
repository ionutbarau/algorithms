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

    public static int doSearchWithFor(Integer[] data, int x){

        //set the step as sqrt(length)
        //get the block in which x should be present



        int length = data.length;
        int step = (int) Math.floor(Math.sqrt(length));
        int prev = 0;

        for(int i = 0; i <= length-1; i=i+step){
            if(x > data[i]){
                continue;
            }

            if(x < data[i]){
                step = i;
                prev = i-step;
            }

            if(x == data[i]){
                return i;
            }
        }

        for(int i = prev;i<=step;i++){
            if(data[i] == x){
                return i;
            }
        }


        return -1;
    }
}
