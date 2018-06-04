import java.util.Arrays;

import com.learn.algorithms.search.BinarySearch;
import com.learn.algorithms.search.JumpSearch;
import com.learn.algorithms.search.LinearSearch;

/**
 * Created by ionut on 5/28/2018.
 */
public class AlgorithmsMain {

    public static Integer[] data = new Integer[]{14,11,22,33,67,34,70,99,250,101,300, 312};
    public static Integer[] sortedData = new Integer[]{11,14,22,33,34,67,70,99,101,250,300};

    public static void main(String[] args){
        //1. Linear search
        System.out.println("== Linear search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = " + x +" found through Linear Search at position : " + LinearSearch.doSearch(data,x)));
        //2. Binary search
        System.out.println("== Binary search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = "+ x +" found through Binary Search at position : " + BinarySearch.doSearch(sortedData, 0,sortedData.length-1,x)));
        //3. Jump (block) search
        System.out.println("== Jump search with while ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = " + x +" found through Jump Search (while) at position : " + JumpSearch.doSearch(sortedData, x)));
    }


}
