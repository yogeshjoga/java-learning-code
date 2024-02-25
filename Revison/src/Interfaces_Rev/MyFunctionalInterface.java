package Interfaces_Rev;

/**
 *
 * @see FunctionalInterface
 * @author <b>Yogesh Joga</b>
 */

@FunctionalInterface
public interface MyFunctionalInterface {

    /**
     * <b>This is the abstract method, in functional Interface only one abstract method allow</b>
     * @param a
     * @param b
     * @return
     */
    int add(int a, int b);

    /**
     *
     *
     * @param a
     * @param b
     * @return
     */
    default int sub(int a, int b){
        var c = a -b;
        System.out.println(c);
        return c;
    }

    /**
     *
     *
     * @param a
     * @param b
     * @return
     */
    static int mod(int a, int b){
        var c = a % b;
        System.out.println(c);
        return c;
    }

    /**
     * <b>In funcational interface some class are allowed with main method also</b>
     *
     *
     */
    class hell{

        /**
         *
         *
         * @param args
         */
        public static void main(String[] args) {
            System.out.println("hello this is yogesh billa");
        }
    }

}
