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
        System.out.println("X found through Linear Search at position : " + LinearSearch.doSearch(data,5));
        //2. Binary search
        System.out.println("X found through Linear Search at position : " + BinarySearch.doSearch(sortedData, 0,sortedData.length-1,5));
        //3. Jump (block) search
        System.out.println("X found through Linear Search at position : " + JumpSearch.doSearch(sortedData, 2));



    }
}
