package Java8Fet_Rev.defaultMethod.WithJava8Features;


/**
 * <p>Here the life easier thing is happening so Let's the Programming a Sim card new features</p>
 * <br>
 * <p>We are implemented <b>Version 1.0 Features Calling and Text Messaging </b></p>
 * <br>
 * <p><b>Once We need update any one of the feature to only one Sim provider, we can use default method signature to Concrete method</b> <br>
 * we need to implement the <b>default methods in a interface its not effected to other implemented classes like old code</b> <br>
 * Most useful Java 8 Feature default methods in Interface's </p>
 *
 * <p>
 *     <ul>
 *         <b>Advantages of the default methods:</b> <br>
 *         <li>Less code </li>
 *         <li> Best in code Readability</li>
 *         <li>default method can reduce the class files when compare to the old approach</li>
 *         <li>More accurate</li>
 *         <li> Easy to handle the project in real time</li>
 *     </ul>
 * </p>
 *
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
public interface SimNew {

    /**
     * <p>Here, One Abstract Method is there Calling we need to implement to this method in implemented class as per our logic</p>
     * <b>calling(); method</b>
     * @since 1.0 version Sim feature
     */
    public void calling();

    /**
     * <p>Here, Another Method is there message we need to implement to this method in implemented class as per our conditions</p>
     * <b>message();</b>
     * @since  1.0 version Sim feature
     */
    public  void message();


    public default  void internet(){
        System.out.println("This is Airtel feature from java 8 feature default method");
    }


    public  default  void videoCalling(){
        System.out.println("This is Airtel Video Calling feature from Java 8 feature default method");
    }


}


