package recursion;

import java.util.Scanner;

/**
 * @see  BinarySearch
 * @see Fibo
 * @see Message
 * @see NumberPrinting
 * @see RecursiveNumbers
 */
public class PrintingNumbers {

    public static void main(String[] args) {
     //   printNum(10);
        System.out.println("------------------");
        printNums(5);
    }


    /***
     * Recursion:
     *          we can print 2 ways
     *          -  Before pushing into Stack
     *          -  Before pop into Stack
     * @param n
     */
    public static void  printNum(int n){
        if(n == 0){
            return;
        }
        // Before pushing into stack
        // Just printing
        System.out.println(n);
        printNum(n-1);
    }


    /**
     * just debug this function and understand call stack flow
     * @param n
     */

    public static void printNums(int n ){
        if(n ==0){
            return;
        }
        printNums(n-1);
        System.out.println(n);
    }


    static Scanner sc = new Scanner(System.in);
}
