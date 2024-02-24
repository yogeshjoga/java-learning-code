package recursion;

public class NumberPrinting {

    public static void main(String[] args) {

        /**
         * method chaining calls one by one in Call Stack
         * for more understanding debug this class
         */
        print1(1);
    }
    /**
     *  before this class visite Message class you can understand much more
     *
     *  Here one issue is there , if we need 10k time print hello world -- is it possible to copy past same code?
     */

    public  static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    public  static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    public  static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    public  static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    public  static void print5(int n){
        System.out.println(n);
    }
}
