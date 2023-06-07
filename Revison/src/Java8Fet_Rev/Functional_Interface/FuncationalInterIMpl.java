package Java8Fet_Rev.Functional_Interface;

/**
 * @see MyFunctionalInteraface
 * @see FunctionalInterface
 * @author  <strong>Yogesh Joga</strong>
 */
public class FuncationalInterIMpl {

    /**
     * <p> In functional Interface only one abstract method contains
     * <br> if any extra method declared it will throw error while compiling </p>
     * <p><strong>What is the use of Lambda Expressions</strong> <br> When we call the functional Interface
     * no need to write implementation class for it where we need to write the logic, we need to use Arrow token and implement the business logic <br>
     * </p>
     *
     * {@code  public static void main(String[] args) {
     *
     *             MyFunctionalInteraface mfI = (a, b) -> {
     *                 var c = a - b;
     *                 System.out.println(c);
     *                 return c;
     *                  };
     *             mfI.sub(10, 20);
     *           }
     *
     *  }
     * @param args
     */


    public static void main(String[] args) {
        // Here we are using lambda Expression to make easier to implementation a FunctionalInterface
            MyFunctionalInteraface mfI = (a, b) -> {
                // By using Arrow token we can create the object and passing the values also
                var c = a - b;
                System.out.println(c);
                return c;
            };
            mfI.sub(10, 20);
    }
}
