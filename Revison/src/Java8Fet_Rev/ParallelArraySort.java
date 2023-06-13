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
        for(int i=0; i<=len; i++){
            arr[i] = i;
        }


        int[] arr1 = {1,3,24,5,4,6,454,4567,76,23,1,8,9,8,45,989};
        Arrays.stream(arr1).forEach( System.out::println);
        return arr;
    }

    public static void parrSort(){
      int[] arr =  addArrayelements(100);

    }
    public static void main(String[] args) {

    }
}
