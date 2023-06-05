package Collections;

import java.util.ArrayList;
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
    public void ArrayListExcution(int l){
        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() -> {
           Stream.iterate(1, i -> i<=l, i -> i++);
            list.add();
        });

    }




    public static void main(String[] args) {

    }
}
