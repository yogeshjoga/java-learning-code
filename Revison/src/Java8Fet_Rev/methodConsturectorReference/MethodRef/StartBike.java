package Java8Fet_Rev.methodConsturectorReference.MethodRef;


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

    /**
     * <p>Here! we implemented non-static method</p>
     * <b> If it is Non-Static Method  the syntax is -{ObjectReference :: MethodName; }</b>
     * @param driver
     * @param drivername
     */

    public void bikerDriver2(String driver, String drivername){
        String driveAdder = driver+drivername;
        System.out.println("this is from non-static method"+driveAdder);
    }

    public static void main(String[] args) {


        // let's develop the Lambda Expression to Functional Interface
        Bike<Integer> bike = (a,b)->{
            var c = a+b;
            System.out.println("from lambda Expressions  : "+c);
        };

        // method reference by using static implemented method
        Bike<Integer> bike1 = StartBike :: bikeDriver;

        // method reference by using non-static implemented method
        // 1st need to crate non-static method class object and pass the object reference and method name
        StartBike sb = new StartBike();

        // calling from object reference
        Bike<String> bike2 = sb::bikerDriver2;

        // Calling the methods
        bike.bikeStart(100,200);

        // calling the method reference, static method
        bike1.bikeStart(200,300);


    }

}
