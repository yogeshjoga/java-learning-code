package Collections;

import java.util.*;
import java.util.stream.Stream;

public class ArrayList001 {

    /**
     *
     * Compare the ArrayList and Vector
     * Vectors is 1996 very old DataStructer
     * ArrayList is the non-synchronized
     * vector is the synchronized
     */

    // ArrayList excution time
    public static void ArrayListExcution(int l){
        ArrayList<Integer> list = new ArrayList<>();

        // Staring time
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
          // Stream.iterate(1, i -> i<=l, i -> i++);
           for(int i=0; i<=l; i++){
               list.add(i);
           }
        });
        long end  = System.currentTimeMillis();
        System.out.println("time = "+ (start-end));

    }

    // syncronized list
     public static void sycnArraylist(){
         // non-syncronized
        List<Integer> li = new ArrayList<>();
        // syncronized List
         List<Integer> lis = Collections.synchronizedList(new ArrayList<>());
         Thread t1 = new Thread(() -> {
             for(int i=0; i<200000; i++){
                 lis.add(i);
             }
          });

         // collections ended

     }




    public static void main(String[] args) {
        ArrayListExcution(2000000);

    }
}
