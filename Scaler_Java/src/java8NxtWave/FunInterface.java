package java8NxtWave;


import java.util.*;

interface Node{
    public int add(int a, int b);
}
public class FunInterface {

    public static void main(String[] args) {
        int x = 10;
        int y = 21;
        // 1st way
        Node add11 = (a, b) -> {
            int c = a+b;
            System.out.println(c);
            return c;
        };

        // second way
        Node add2 = (aa, bb) -> aa+bb;


       int num = add2.add(x,y);
        System.out.println(num);

    }


}
