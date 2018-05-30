import java.util.Arrays;

import com.learn.algorithms.search.BinarySearch;
import com.learn.algorithms.search.JumpSearch;
import com.learn.algorithms.search.LinearSearch;

/**
 * Created by ionut on 5/28/2018.
 */
public class AlgorithmsMain {

    public static Integer[] data = new Integer[]{1,2,5,3,4,6,7,8,9,10};
    public static Integer[] sortedData = new Integer[]{1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args){
        //1. Linear search
        System.out.println("== Linear search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = " + x +" found through Linear Search at position : " + LinearSearch.doSearch(data,x)));
        //2. Binary search
        System.out.println("== Binary search ==");
        Arrays.stream(sortedData).forEach(x -> System.out.println("X = "+ x +" found through Binary Search at position : " + BinarySearch.doSearch(sortedData, 0,sortedData.length-1,x)));
        //3. Jump (block) search
        System.out.println("== Jump search ==");
        Arrays.stream(sortedData).forEach(x -> System.out.println("X = " + x +" found through Jump Search at position : " + JumpSearch.doSearch(sortedData, x)));



    }
}
