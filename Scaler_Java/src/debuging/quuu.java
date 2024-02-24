package debuging;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class quuu {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        Queue<Integer> pr = new PriorityQueue<>();
        pr.add(23213);
        LinkedList<Integer> list = new LinkedList<>();
        list.push(989);
        list.add(8787);

        int kk = -2;
        if(kk > 0){
            System.out.println(kk);
        }else{
           // throw new IllegalArgumentException("It's Negative number");
          //  throw new IllegalStateException("jfkdjlfkjdkljf");
            throw new ArithmeticException("jdkjfkdj");


        }
    }
}
