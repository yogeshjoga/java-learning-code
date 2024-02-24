package recursion;

import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {12,123,12134,1231432,1453412,3534234,234324,3,1,2};
        Arrays.sort(arr);
        int target = 2;
      int index =  search(arr,target);
        System.out.println(index);
    }


    /**
     * Understand how many variables we need
     * what values to pass next method call?
     * what is expected return type
     * what is the base case
     * @param arr
     * @param target
     * @return
     */
    public static int  search(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;
       return  binarySearch(arr, target, start , end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target ){
            return mid;
        }

        if(arr[mid] > target){
            end = mid-1;
            return binarySearch(arr, target, start, end);
        }else{
            start = mid+1;
            return binarySearch(arr, target, start, end);
        }

    }
}
