package Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7;

/**
 * <p>Airtel Sim Card provider given some feature's to user's Calling and Texting Sms features</p> <br>
 *
 * @see Sim
 *
 * @author  <b>Yogesh Joga</b>
 */
public class Airtel implements  Sim {


    /**
     * <b>This is the feature of the sim Calling, Incoming and OutGoing Service to Airtel Sim holders</b>
     */
    @Override
    public void calling() {
        System.out.println("Calling from Airtel Sim card service");

    }

    /**
     * <b>Sim Sms feature Inbox and Sentbox messing Service to Airtel Sim holders</b>
     * <br>
     *
     * @see Sim
     */
    @Override
    public void sms() {

        System.out.println("Texting from Airtel Sim card service");
    }
}
