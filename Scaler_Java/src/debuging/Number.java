package debuging;

public class Number {

    public static void main(String[] args) {


        num1(1);
    }

    /**
     * calling one function
     * the call stack
     * excuted one by one function
     *
     * See actuall flow of the code is same functions repeatdly calling one by one printing 5 numbers
     * if you want 1 million number how to print. by calling methods?
     *
     *
     *
     *   what is recursion
     *   a function calls itself is called recursion
     *
     * @param x
     */

    public static void num1(int x){
        System.out.println(x);
        num2(2);
    }
    public static void num2(int x){
        System.out.println(x);
        num3(3);
    }

    public static void num3(int x){
        System.out.println(x);
        num4(4);
    }
    public static void num4(int x){
        System.out.println(x);
        num5(5);
    }
    public static void num5(int x){
        System.out.println(x);
    }
}
