package Java8Fet_Rev.defaultMethod.WithJava8Features;
/**
 * <p><b>Customer Class we will use functionality here</b></p>
 *
 * @since java 8 features
 * @see SimNew
 * @see Customer
 * @see Mobile
 * @see Airtelnew
 * @see BSNLnew
 * @author <b>Yogesh Joga</b>
 */
public class Customer {

    /**
     * <p>Main method here we will start the execution of the code </p>
     * @param args
     */
    public static void main(String[] args) {
        // mobile object
        Mobile mobile = new Mobile();
        // sim types
        String sim3G = "3G";
        String sim2G = "2G";
        // mobile.insertSimCard(new Airtelnew(),sim3G);
        mobile.insertSimCard(new BSNLnew(),sim2G);
    }
}
