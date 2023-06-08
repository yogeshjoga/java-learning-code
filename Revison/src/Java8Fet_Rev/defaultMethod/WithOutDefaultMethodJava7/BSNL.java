package Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7;

public class BSNL implements Sim {


    /**
     * <b>This is the feature of the sim Calling, Incoming and OutGoing service to BSNL sim User</b>
     */
    @Override
    public void calling() {
        System.out.println("Calling from BSNL sim card user");

    }

    /**
     * <b>Sim Sms feature Inbox and Sentbox messing Service to Bsnl sim user</b>
     * <br>
     *
     * @see Sim
     */
    @Override
    public void sms() {
        System.out.println("Texting from BSNL sim card User");

    }
}
