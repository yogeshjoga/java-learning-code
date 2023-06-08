package Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7;

/**
 * <p>This class is for user activity class use the Sim Card </p>
 *
 *
 * @author <b>Yogesh Joga</b>
 */
public class UserMobile {


    public static void main(String[] args) {
        // I am using Airtel 3G sim card
        Airtel3G airtel3G = new Airtel3G();
        airtel3G.calling();
        airtel3G.sms();
        airtel3G.internetSim3G();

        // I am using now Airtel Sim Card
        Airtel airtel = new Airtel();
        airtel.calling();
        airtel.sms();

        // I am using BSNL Sim card
        BSNL bsnl = new BSNL();
        bsnl.calling();
        bsnl.sms();
    }

}
