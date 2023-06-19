package Interfaces_Rev;

/**
 *
 *
 * @see MyFunctionalInterface
 * @see FunctionalInterface
 *
 * @author <b>Yogesh Joga</b>
 */
public class FunClassImplemenation {

    static MyFunctionalInterface fun = (a,b) ->{
        var c = a+b;
        System.out.println(c);
        return c;
    };



    public static void main(String[] args) {
      fun.add(10,20);
      fun.sub(1000,300);

    }
}
