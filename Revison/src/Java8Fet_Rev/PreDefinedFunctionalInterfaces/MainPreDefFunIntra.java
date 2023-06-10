package Java8Fet_Rev.PreDefinedFunctionalInterfaces;

import java.util.function.Predicate;

/**
 *
 * <p>To better to Know about the some of Generics Types ex: T E K N V R</p>
 *
 * <p>
 *     <ol>
 *         <li><b> T - Type</b></li>
 *         <li><b> E - Element</b></li>
 *         <li><b> K - Key</b></li>
 *         <li><b> N - Number</b></li>
 *         <li><b> V - Value</b></li>
 *         <li><b> R - Result of Function</b></li>
 *     </ol>
 * </p>
 *
 * <p>
 *     <b>The Main topics of PreDefined Functional Interfaces</b>
 * </p>
 * @since <b>Java 8v Features</b>
 *
 *
 * @see FunctionalInterface
 * @see java.util.function.Predicate
 * @see java.util.function.Function
 * @see java.util.function.Supplier
 * @see java.util.function.Consumer
 * @see java.util.function.BiPredicate
 * @see java.util.function.BiFunction
 * @see java.util.function.BiConsumer
 * @see java.util.function.IntPredicate
 * @see java.util.function.IntFunction
 * @see java.util.function.IntConsumer
 * @author <b>Yogesh Joga</b>
 */
public class MainPreDefFunIntra {


    public static boolean predicateImple(int num){

        Predicate<Integer> pr = ((num1)->{
            if(num % 2 == 0){
                System.out.println(num+" : it is the Even number!");
                return true;
            }else{
                System.out.println(num +" : it is not a even number");
                return false;
            }
        });
        return pr.test(num);
    }

    public static void main(String[] args) {


        int num = 8888;
        predicateImple(num);

    }
}
