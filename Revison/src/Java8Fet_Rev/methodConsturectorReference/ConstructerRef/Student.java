package Java8Fet_Rev.methodConsturectorReference.ConstructerRef;

/**
 *
 *
 * @see FunctionalInterface
 * @see StudentSchool
 * @see StudentName
 * @see Student
 * @since <b>Java 1.8 or 8v features</b>
 *
 *
 *
 *
 * @author <b>Yogesh Joga</b>
 */
@FunctionalInterface
public interface Student {
    /**
     *
     * <p>
     *     <ol>
     *         <li><b>Is it accepted No-Args Constructor and All Args Constructor </b></li>
     *         <p>Yes! Its accepted both <b>No args and all args Constructor's</b></p>
     *         <li>Here Tested both the scenarios </li>
     *     </ol>
     * </p>
     *
     *
     * @param studentname
     * @return
     */
    public StudentName getStudent(String studentname);

    // No arg Constructor we will discuss this implementation class by using constructor Reference
    // public StudentSchool getStudent();
}
