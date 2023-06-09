package Java8Fet_Rev.methodConsturectorReference.ConstructerRef;




/**
 *
 * @see FunctionalInterface
 * @see StudentSchool
 * @see StudentName
 * @see Student
 * @since <b>Java 1.8 or 8v features</b>
 * @author <b>Yogesh Joga</b>
 */
public class StudentSchool {


    /**
     * <p>
     *     <b>There is no Difference in Syntax in parameter or non-parameter constructor </b>
     *     <br>
     *     <b>The syntax is :{ Interface refVariable = constructorClassName :: newKeyword; } </b>
     * </p>
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        // Here the syntax is ClassName :: newKeyword;  new keyword for creating new object with arguments
        Student st = StudentName::new;
        // if it is parameter constructor or argument constructor will make functional interface abstract method with parameter
        StudentName s1 = st.getStudent("yogesh");

        // this is for no args constructor
         StudentName s = st.getStudent("");

    }
}
