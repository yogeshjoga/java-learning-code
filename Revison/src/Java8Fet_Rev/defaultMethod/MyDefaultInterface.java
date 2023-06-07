package Java8Fet_Rev.defaultMethod;

public interface MyDefaultInterface {


    /**
     * <p>Let's create a public Abstract Method, Non-implemented method
     * with body or logic </p>
     *
     *
     * @return int
     */
    public int add();



    /**
     * <p> Here, we will write one implemented method</p>
     * <ul>
     *     <li>What is the use of this implemented Method <br>
     *     <strong>Ans:</strong> Its not mandatory to implement all the implemented classes its optional to override the method or implementation</li>
     *     <li>What is default Method? <br> <strong>Ans:</strong> A Default method is an interface method that has implementation body </li>
     *     <li>Why Default Method? <br> <strong>Ans:</strong> It's allow the already implemented class to no need to Override this method or not mandatory
     *                  <ul>
     *                      <li>For adding new functionality to an existing interface without breaking <br>
     *                      /Disturbing Existing implemented classes </li>
     *                      <li> using default method feature we can add new methods in interface by not forcing <br>
     *                      subclasses to implement those new methods</li>
     *                      <li>So, we can say with default method feature implementation classes programmers are <br>
     *                      free from implementing new methods. They can continue with old implementation <br>
     *                      by using new implementation new futures can provide implementation</li>
     *                  </ul></li>
     *     <li>Real Time Example of Default method? <strong> Below the code snippet you can understand it</strong></li>
     *     <li>Syntax to Create Default Method? <strong> Below method example:</strong></li>
     *     <li>Invoking and executing the default methods</li>
     *
     * </ul>
     *
     */
    default  void myMethod(){
        System.out.println("hello this is the Default Method from interface");
    }


}
