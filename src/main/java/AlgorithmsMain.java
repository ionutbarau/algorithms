import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import com.learn.algorithms.search.BinarySearch;
import com.learn.algorithms.search.JumpSearch;
import com.learn.algorithms.search.LinearSearch;
import com.learn.algorithms.sort.*;

/**
 * Created by ionut on 5/28/2018.
 */
public class AlgorithmsMain {

    public static Integer[] data = new Integer[]{14,11,22,33,67,34,70,99,250,101,300, 312};
    public static Integer[] sortedData = new Integer[]{11,14,22,33,34,67,70,99,101,250,300};

    public static LocalDateTime start;

    public static void main(String[] args){
        //1. Linear search
        System.out.println("== Linear search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = " + x +" found through Linear Search at position : " + LinearSearch.doSearch(data,x)));
        //2. Binary search
        System.out.println("== Binary search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = "+ x +" found through Binary Search at position : " + BinarySearch.doSearch(sortedData, 0,sortedData.length-1,x)));
        //3. Jump (block) search
        System.out.println("== Jump search ==");
        Arrays.stream(data).forEach(x -> System.out.println("X = " + x +" found through Jump Search (while) at position : " + JumpSearch.doSearch(sortedData, x)));

        //4. Interpolation search
        //System.out.println("== Interpolation search ==");
        //Arrays.stream(data).forEach(x -> System.out.println("X = " + x +" found through Interpolation Search at position : " + InterpolationSearch.doSearch(sortedData, x)));
        //5. Bubble sort
        System.out.println("=== Bubble sort ===");
        start = LocalDateTime.now();
        BubbleSort.doSort1(data);
        System.out.println(Arrays.asList(data) + " in " + Duration.between(start,LocalDateTime.now()).toMillis() + " milliseconds");
        resetDataAfterInPlaceAlgorithm();

        System.out.println("=== Selection sort ===");
        start = LocalDateTime.now();
        SelectionSort.doSort(data);
        System.out.println(Arrays.asList(data) + " in " + Duration.between(start,LocalDateTime.now()).toMillis() + " milliseconds");
        resetDataAfterInPlaceAlgorithm();


        //6. Insertion sort
        System.out.println("=== Insertion sort ===");
        start = LocalDateTime.now();
        System.out.println(InsertionSort.doSort(Arrays.asList(data)) + " in " + Duration.between(start,LocalDateTime.now()).toMillis() + " milliseconds");

        //7. Quick sort
        System.out.println("=== Quick sort ===");
        start = LocalDateTime.now();
        System.out.println(QuickSort.doSort(Arrays.asList(data)) + " in " + Duration.between(start,LocalDateTime.now()).toMillis() + " milliseconds");


        //7. Merge sort
        System.out.println("=== Merge sort ===");
        start = LocalDateTime.now();
        System.out.println(MergeSort.doSort(Arrays.asList(data)) + " in " + Duration.between(start,LocalDateTime.now()).toMillis() + " milliseconds");


    }

    public static void resetDataAfterInPlaceAlgorithm() {
        data = new Integer[]{14,11,22,33,67,34,70,99,250,101,300, 312};
    }


}
