package Java8Fet_Rev;

import java.sql.Array;
import java.util.Arrays;

/**
 * <p>Parallel sort Array, we can sort the array by using array with starting and ending indexing also this is the major advantage</p>
 *
 * @author <b>Yogesh Joga</b>
 */

public class ParallelArraySort {


    public static int[] addArrayelements(int len){

        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = i;
        }


        int[] arr1 = {1,3,4,6,5,7,8,11,13,12,10,14,17,16,18,20,21,30,40,29,31,32,34,35,36};
        System.out.println("Normal unsorted Array");
        Arrays.stream(arr1).forEach( System.out::println);

        Arrays.parallelSort(arr1);
        System.out.println("Sorted Array from Arrays.parallelSort method");
        Arrays.stream(arr1).forEach(System.out::println);
        return arr;
    }

    public static void parrSort(){
      int[] arr =  addArrayelements(100);

    }
    public static void main(String[] args) {

        addArrayelements(100);

    }
}
