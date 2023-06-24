package Java8Fet_Rev.FIfunctions;

import Java8Fet_Rev.Functional_Interface.Fun;

import java.util.PrimitiveIterator;
import java.util.function.*;

/**
 *
 *
 * @author <b>Yogesh Joga</b>
 */
public class BuiltInFunctions {

    /**
     *<b>Test() method @override</b>
     * <b>Predicate -- return boolean<br>
     *  Supplier -- return the R  <br>
     *  Consumer ---> return void  <br>
     *  Double arg's Bi-functions
     *  BiPredicate ---> return boolean <br>
     *  BiSuppllier --> return the R <br>
     *  BiConsumer --> return void</b>
     * @param a
     * @param b
     */
    public  void grater(int a, int b){
        Predicate<Integer> pre = integer -> {
            boolean boo = a>b;
            return boo;
        };
    }

    int num1 = 200;
    int num2 = 300;

    String name = "yogesh joga";


    /**
     * <p>Only one Argument passing</p>
     */
    Predicate<Integer> myName = (billa) -> {
        var cName = "yogesh joga";
        if(billa.equals(cName)){
            return true;
        }
        return false;
    };





    /**
     * <b>test() method</b>
     * <b>BiPredicate --> function</b>
     * <p>Here! we will write a code and passing two arg's</p>
     */
    BiPredicate<Integer, Integer> isPass = (a,b) -> {
       var c = a+b;
       if(c == 500){
           return true;
       }
       return false;
   };

    /**
     * <b>apply() method</b>
     * <b>Passing only single value as a argument</b>
     */
    Function<String, Integer> fun = (hello) -> {
        String nAme = "yogesh";
        if(nAme.equals("yogeshJ")) {
            return 1;
        }
        return 0;
    };

    /**
     * <b>appy() method</b>
     * <b>Passing two arguments in a method</b>
     */
    BiFunction<Integer, Integer,Long> multiP = (a,b) -> {
        long c = a+b;
        return c;
    };

    /**
     *
     * <b>accept() method</b>
     * <b>It's only consume the data or process the data in consumer</b>
     */

    Consumer<Integer> con = (a) ->{
        var c = a*a;
        System.out.println(c);
    };

    /**
     *
     * <b>We can pass Two arguments from Accept() Method @overriding</b>
     */
    BiConsumer<Integer,Integer> addBiCon = (a,b) -> {
        var c = a + b;
        System.out.println(c);
    };

    /**
     * <b>supplier only for get, get() method only having inside the supplier Functional Interface</b>
     */
    Supplier<String> sup = () -> {
        var myName = "yogesh joga";
        return myName;
    };


    public static void main(String[] args) {
        // Creation new object
        BuiltInFunctions obj = new BuiltInFunctions();



    }

}
