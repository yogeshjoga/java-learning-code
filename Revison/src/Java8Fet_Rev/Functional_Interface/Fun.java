package Java8Fet_Rev.Functional_Interface;

/**
 *  <b>PreRequisites to Functional Programming</b>
 *  <ol>
 *      <li><b>Functional Interface with @Annoation</b></li>
 *      <li><b>Know about Lambda Expressions Arrow Token ->  </b></li>
 *  </ol>
 * <br>
 *
 *
 * <p>
 *     <b>Just answer below Questions may you can crack the interview</b>
 *     <ol>
 *         <li>What is the functional interface (alias SAM)</li>
 *         <li>Why functional Interface?</li>
 *         <li>How can we create functional interface</li>
 *         <li>Identifying correct functional interface?</li>
 *         <li>Compiler activities With respect to functional interface</li>
 *         <li>Two ways of creating functional interface?</li>
 *         <ol type="i">
 *             <li>Creating as effective functional interface?</li>
 *             <li>Forcing it be functional interface?</li>
 *         </ol>
 *         <li>What is @FunctionalInterface</li>
 *         <li>Why @FunctionalInterface</li>
 *         <li>How can we tell to compiler and other programmer an interface is a functional interface?</li>
 *         <li>rules in creating functional interface?</li>
 *         <br>
 *         <li>Different programming elements allowed and not allowed in functional interface & <br> <b>Java 9V Enhancement effect to functional interface?</b></li>
 *            <ol>
 *                <p><b>Allowed or Not?</b></p>
 *                <li>Public static final variables?  <b> Multiple Allow</b> </li>
 *                <li>Public abstract methods? <b> Single Method Allow</b></li>
 *                <li>public static inner classes? <b> Multiple Allow</b> </li>
 *                <li>public default methods? <b> Multiple Allow</b> </li>
 *                <li>public static methods? <b> Multiple Allow</b> </li>
 *                <li>private static  and non-static methods? <b> Multiple Allow</b> </li>
 *                <li>java.lang.Object class methods as abstract and default methods? <b> Multiple Allow Only Abstract methods, default methods not Allow.</b></li>
 *            </ol>
 *     </ol>
 * </p>
 *
 *
 * <p><b>Questions of the Day:-</b></p>
 * <ol>
 *     <li><b>After Removing @FunctionalInterface Annotation, what happen with multiple static, abstract,Non-static, <br>object Class Abstract and default methods</b></li>
 *     <li><b>Is it compile the default toString() method ?</b></li>
 * </ol>
 * <br>
 * <b>Use a @FunctionalInterface</b> Annotation
 * @see FunctionalInterface
 * @see Object
 * @see java.lang.annotation.Annotation
 * <br>
 *
 * <a href="https://youtube.com/playlist?list=PLVlQHNRLflP_VZ0e3G7BUhjn11sMbiXz_"><b>Youtube_video NIT Hk Java 8 features playlist </b></a>
 * @author <b>Yogesh Joga</b>
 */

@FunctionalInterface
public interface Fun {

    /**
     *
     * <p> It <b>Allow the only one Abstract Method in Functional Interface, Only user defined Abstract method</b> <br>If we add java.lang.Object class Abstract methods allow</p>
     *<br>
     * <p>Interface accept n number of abstract methods in interface, but Object class methods if we override by using default its not accepted at any interface level</p>
     * @param a
     * @param b
     * @return add two integers
     */
  public void add(int a, int b);

    /**
     * public static final variable are allowed
     */
  public static final int mynum =10;

    /**
     * public static sub(){} with implemented methods are allowed
     * @param a
     * @param b
     * @return int
     */
      public static int sub(int a, int b){
      return 0;
     }

    /**
     * Public static class are also allowed
     */
    public static class hello{}

    /**
     * public default methods are also allowed
     */
    public default  void mydefault(){}




}
