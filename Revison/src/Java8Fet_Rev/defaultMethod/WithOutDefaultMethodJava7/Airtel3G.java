package Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7;

/**
 *
 * <p>Here the problem is we crated new interface and new class for one feature for particular sim card service provider</p>
 *
 * @see Sim
 * @see Airtel
 * @see BSNL
 * @see Sim3G
 * @see Airtel3G
 *
 *
 * @author <b>Yogesh Joga</b>
 */
public class Airtel3G extends Airtel implements Sim3G{
    /**
     * <p>Okay! we are added a new feature to sim, that is Internet access through Airtel sim card user <br>
     * It won't disturb to BSNL sim card User's need to effect only Airtel user's</p>
     */
    @Override
    public void internetSim3G() {
        System.out.println("Accessing the Internet through the Airtel Sim Card user");
    }
}
