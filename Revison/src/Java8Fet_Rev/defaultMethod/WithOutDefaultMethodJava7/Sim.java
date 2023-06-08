package Java8Fet_Rev.defaultMethod.WithOutDefaultMethodJava7;

/**
 *
 *
 *
 * <p>After some time Sim company <b>(Airtel have enough money to invest internet service and video Call service)</b> needs to update feature like Internet access <br>
 * and video Calling feature, <b>BSNL is a Gov sector so they didn't invest huge amount to make new services</b> Here the problem is we need to update the feature <br>
 * but not effecting to the other Sim Service providers</p>
 *
 *
 * @implNote  <p> If we will add any new feature here it will effect the all the Implemented classes Compiler will through the exception, so we need to create new interface <br>
 * and new Class for that new sim feature at every time we need to implement the new interface and new class for the single single new feature </p>
 * <p>
 *     <ul>
 *         <li><b>Disadvantages to this architecture of before the java 1.7</b></li>
 *         <li>Code Readability is decreased</li>
 *         <li>Class files are increased based on new Features</li>
 *         <li>Project handling is also very hard to maintained, every time we need to create new interface and implemented classes for that</li>
 *     </ul>
 * </p>
 * @since  Java 1.7
 *
 *
 * @see Sim
 * @see Airtel
 * @see BSNL
 *
 * @author  <b>Yogesh Joga</b>
 */
public interface Sim {
    /**
     * <b>This is the feature of the sim Calling, Incoming and OutGoing</b>
     */
    public  void calling();

    /**
     * <b>Sim Sms feature Inbox and Sentbox messing Service</b>
     *  <br>
     * @see Sim
     */
    public void sms();



}
