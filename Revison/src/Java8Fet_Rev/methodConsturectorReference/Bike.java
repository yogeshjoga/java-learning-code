package Java8Fet_Rev.methodConsturectorReference;

/**
 *
 * <p><b>Method and Constructor References</b></p>
 * <p>
 *     <ol>
 *         <li><b>Where we use Lambda Expressions and Where we use the Method reference </b></li>
 *         <p><b>Ans:</b> If we have already implemented, method <b>(If it is static or Non-static and different Return type doesn't matter about it, But
 *              we must match with method arguments)</b> <br> we can use Method Reference, If we doesn't have any method implementation we can go with lambda expression</p>
 *     </ol>
 * </p>
 *
 * <b>Generics type of the interface data</b>
 *
 * @see FunctionalInterface
 * @see
 * @see
 *
 *
 *
 *
 * @author <b>Yogesh Joga</b>
 */

@FunctionalInterface
public interface Bike <T> {


    /**
     *
     * @param start type start is String
     * @param key   key type is Int let see how to handle this.
     */
    public void bikeStart(T start, T key);
}
