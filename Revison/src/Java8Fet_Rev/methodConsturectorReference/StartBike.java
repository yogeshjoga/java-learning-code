package Java8Fet_Rev.methodConsturectorReference;


/**
 *
 * <p>Here, we can implementation the Functional interface Abstract method, by using both the way's <br>
 *  <b>Lambda Expressions and Method/Constructor Reference's in Java 1.8v fe</b></p>
 *
 *
 * @see Bike
 * @see FunctionalInterface
 * @see Object
 *
 * @since  Java 1.8v
 *
 * @author <b>Yogesh Joga</b>
 */
public class StartBike {

    /**
     * <p>Here! I am implemented logic to the functional interface method and this is the static method</p>
     * <b>How to use the static methods in Functional Interface method reference's? <br>
     * Ans: </b> --  the syntax is <b>{ Classname :: methodName ; } </b>
     * @param start
     * @param key
     * @return
     */
    public static int bikeDriver(int start, int key){
        int c = start + key;
        // for printing the values
        System.out.println("this is from bikeDriver static Method :  "+c);
        return c;
    }

    public static void main(String[] args) {


        // let's develop the Lambda Expression to Functional Interface
        Bike<Integer> bike = (a,b)->{
            var c = a+b;
            System.out.println("from lambda Expressions  : "+c);
        };

        // method reference by using static implemented method
        Bike<Integer> bike1 = StartBike :: bikeDriver;


        // Calling the methods
        bike.bikeStart(100,200);

        // calling the method reference, static method
        bike1.bikeStart(200,300);


    }

}
