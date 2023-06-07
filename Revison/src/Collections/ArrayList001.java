package Collections;

import java.util.*;
import java.util.stream.Stream;

public class ArrayList001 {

    /**
     *
     * Compare the ArrayList and Vector
     * Vectors is 1996 very old Data Structure
     * ArrayList is the non-synchronized
     * vector is the synchronized
     * @author <strong>Yogesh joga</strong>
     * @see Runnable
     * @see Thread
     * @see Stream
     * @see Vector
     * @see ArrayList
     * @see Stack
     * @see java.lang.reflect.GenericArrayType
     *
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

    /**
     *
     * <p>ArrayList by default not SynchronizedList,
     * while using multiThreading it will execute some of list only
     * not a all the list iterator, Vector is the by default synchronizedList
     * Vector performance is very low when compare to ArrayList</p>
     *
     * @throws InterruptedException
     * @see Thread
     * @see Runnable
     */

    // synchronized list
     public static void sycnArraylist() throws InterruptedException {
         // non-synchronized
        List<Integer> li = new ArrayList<>();
        // synchronized List
         List<Integer> lis = Collections.synchronizedList(new ArrayList<>());

         // Thread one
         Thread t1 = new Thread(() -> {
             for(int i=0; i<200000; i++){
                 lis.add(i);
             }
          });


         // thread 2
         Thread t2 = new Thread(() -> {
             for(int i=0; i<200000; i++){
                 lis.add(i);
             }
         });

         t1.start();
         t2.start();
         t1.join();
         t2.join();

         // collections ended

     }


    /**
     * <p>Invoke the all methods in main method will Execute one by one method and line by line</p>
     * @param args
     */
    public static void main(String[] args) {
        ArrayListExcution(2000000);

    }
}
