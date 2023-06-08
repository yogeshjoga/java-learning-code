package Java8Fet_Rev.Functional_Interface;


/**
 *
 * <p>Generics using to solve Return type of the method output</p>
 *
 *
 * @see Fun
 * @see FunctionalInterface
 * @see FuncationalInterIMpl
 * @see MyFunctionalInteraface
 * @author <b>Yogesh Joga</b>
 */


@FunctionalInterface
public interface GenricFunInterface<T>{
    /**
     * We are using Generic type Return here
     *
     * @param a
     * @param b
     * @return Generic type return
     */
    public T add(T a, T b);
}
