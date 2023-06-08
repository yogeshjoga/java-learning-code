package Java8Fet_Rev.defaultMethod.WithJava8Features;

/**
 * <p><b>Mobile Class we will use functionality here</b></p>
 *
 * @since java 8 features
 * @see SimNew
 * @see Customer
 * @see Mobile
 * @see Airtelnew
 * @see BSNLnew
 * @author <b>Yogesh Joga</b>
 */
public class Mobile {

    /**
     *
     * @param simNew sim name Airtel or BSNL
     * @param type sim type is 2G or 3G
     */
    public void insertSimCard(SimNew simNew, String type){
        // flow control if sim type is 3G, allow all the features to mobile
        // otherwise it won't allow
        if(type.equals("3G")){
            simNew.calling();
            simNew.message();
            simNew.internet();
            simNew.videoCalling();
        }else{
            simNew.calling();
            simNew.message();
        }
    }
}
