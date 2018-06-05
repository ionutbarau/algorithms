package com.learn.algorithms.search;

/**
 * It is an improvement over binary search. While binary search goes to the middle element,
 * interpolation search may go to different locations according to the value that is being searched for.
 * For example if the value that is beign searched for is closer to the last element, interpolation search is likely to start search toward the end.
 *  The list of course needs to be sorted.
 *  -- pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ] --
 *
 * Created by ionut on 6/4/2018.
 */
public class InterpolationSearch {

    public static int doSearch(Integer[] data, int x){

        //find indexes of both ends
        int lowerEnd = 0;
        int upperEnd = data.length-1;
        //since the array is sorted the element must be present inside the lower and upper ends
        while(lowerEnd <= upperEnd && x >= data[lowerEnd] && x <= data[upperEnd]){
            //probing the position with keeping uniform distribution in mind
            int pos = lowerEnd + (((upperEnd -lowerEnd) / (data[upperEnd] - data[lowerEnd])) * (x - data[lowerEnd]));

            if(data[pos] == x){
                return pos;
            }

            //if x is larger than pos, then it is in the upper part
            if(data[pos] < x){
                lowerEnd = pos + 1;
            }else{
                //if x is lower than pos, then it is in the lower part
                upperEnd = pos - 1;
            }
        }

        return -1;
    }
}
