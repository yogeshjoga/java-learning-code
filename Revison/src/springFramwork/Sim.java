package springFramwork;


/**
 *
 * <p>
 *     The project is Sim and mobile --> the sim provider is given some feature to sim customer
 *     <br> Here some of the Sim network providers are there
 *     <ol>
 *         <li>Airtel</li>
 *         <li>Idea</li>
 *         <li>Bsnl</li>
 *     </ol>
 *     <br>
 *     The market and technology is suddenly growing, so idea and Airtel network provider upgrading into
 *     <br> 4g technology or migrate to new network or new mobile we need to switch that.. with out interrupting
 *     <br> original code
 * </p>
 * @author <b>Yogesh Joga</b>
 */
public interface Sim {

    // calling code
    void calling ();


    // internet code
    void internet();


}
