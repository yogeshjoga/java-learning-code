package Interfaces_Rev.Project;

/**
 * <p>
 *
 * </p>
 *
 * @author <b>Yogesh Joga</b>
 */

@FunctionalInterface
public interface Fun <T,R>{

    /**
     *
     *
     * @param model
     * @param cc
     * @return
     */
   R myVehicle(T model, T cc);


    /**
     * <b>Here! im initialization a new variable </b>
     *
     *
     */
    final static int wheels = 0;


   

}
