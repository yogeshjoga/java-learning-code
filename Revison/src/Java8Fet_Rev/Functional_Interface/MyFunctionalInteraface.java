package Java8Fet_Rev.Functional_Interface;

import java.lang.annotation.Documented;

/**
 * @see FunctionalInterface
 * @see java.lang.annotation.Annotation
 * @see Override
 * <p> <strong> We can use @FunctionalInterface annotaion also here </strong></p>
 * @author <strong> Yogesh Joga</strong>
 */

@FunctionalInterface
public interface MyFunctionalInteraface {


    /**
     *
     * @implNote <p> A FunctionalInterface contains only one abstract method </p>
     * @param a
     * @param b
     * @return Integer
     *
     * <p>A FunctionalInterface Contains only one abstract method that can implement any other classes <br>
     * Let's implement the subtract method by using 2 variables and process </p>
     */
    public int sub (int a, int b);


}
