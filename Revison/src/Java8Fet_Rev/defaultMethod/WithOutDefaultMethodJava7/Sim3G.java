package Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7;


/**
 * <p>Let's develop the new feature to <b>AIRTEL sim Provider</b> Need effect only Airtel only not a BSNL sim service provider <br>
 * okay! so we need to create a new interface to Extends sim interface, Now it has both the interface features inherited to new Sim 3G</p>
 * @see Sim
 * @see Airtel
 * @see BSNL
 * @see Sim3G
 *
 * @since  java 1.7
 * @author  <b>Yogesh Joga</b>
 */
public interface Sim3G extends  Sim{

    /**
     * <p>Okay! we are added a new feature to sim, that is Internet access through Airtel sim card user <br>
     * It won't disturb to BSNL sim card User's need to effect only Airtel user's</p>
     */
    public void internetSim3G();
}
