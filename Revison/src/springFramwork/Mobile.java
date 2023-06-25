package springFramwork;


/**
 *
 * @author <b>Yogesh Joga</b>
 */
public class Mobile {

    public static void main(String[] args) {
        // created a mobile class that's run the sim features from sim interface
        Sim sim = new Airtel(); // before sim we can create one one object to every sim card as well as mobile also
        // calling feature from sim
        sim.calling();
        // internet feature from sim
        sim.internet();
    }
}
