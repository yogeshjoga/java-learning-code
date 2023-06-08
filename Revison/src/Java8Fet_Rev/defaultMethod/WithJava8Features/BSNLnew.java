package Java8Fet_Rev.defaultMethod.WithJava8Features;

/**
 * <p>Here the life easier thing is happening so Let's the Programming a Sim card new features, <br> <b> No need to create new interface and new Class implementation </b> <br>
 * we need to just Override the method when it required based on situation </p>
 *
 *
 * <br>
 * <p> Here! No need to add any new feature.. government doesn't have enough money to update the feature</p>
 * @see SimNew
 * @see Airtelnew
 * @see BSNLnew
 * @see Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7.Sim
 * @see Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7.Sim3G
 * @see Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7.BSNL
 * @see Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7.Airtel
 * @see Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7.Airtel3G
 *
 * @author  <b>Yogesh Joga</b>
 */
public class BSNLnew implements SimNew {
    /**
     * <p>Here, One Abstract Method is there Calling we need to implement to this method in implemented class as per our logic</p>
     * <b>calling(); method</b>
     *
     * @since 1.0 version Sim feature
     */
    @Override
    public void calling() {
        System.out.println("Calling From BSNL sim Card java 8");
    }

    /**
     * <p>Here, Another Method is there message we need to implement to this method in implemented class as per our conditions</p>
     * <b>message();</b>
     *
     * @since 1.0 version Sim feature
     */
    @Override
    public void message() {
        System.out.println("Texting from BSNL sim Card java 8");
    }
}

