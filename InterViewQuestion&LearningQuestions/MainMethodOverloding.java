/**
 * yes, We can overload the main method 100% valid
 * 
 * If we can overload a main method it will taken as normal method only
 * JVM Checking a main method syntax as like as
 * public static void main(String[] args)
 * method overloading mean same method name but different formal args.
 */

 /**
  * The programming code after compilation
  * It will Run's any where (like different platforms and
  * different architectur) it may be hardware are software
  */

  /**
   *  javaC is a compiler it compile the code and genrate byte code 
   *  .class file format.
   * 
   * JRE is the java rum time enviromental it will take .class file 
   *  to interpreation returns to actual functionaltity to user.
   * and it contains JIT compailer.
   * 
   * JDK it is the java development kit it contains JRE JVM JIT JAVAC.
   *  Developer needs to JDK and clients need to JRE.
   * Developer will write programming and runs it.
   * clients only run the code and utilse the code functionaltity.
   *  
   */

   /**
    * JIT stands for Java-In-Time Compiler. The JIT compilation is also known as dynamic compilation
    * If the JIT compiler environment variable is properly set, the JVM reads the .class file (bytecode) 
    * for interpretation after that it passes to the JIT compiler for further process.
    *  After getting the bytecode, the JIT compiler transforms it into the native code (machine-readable code).
    */

    /**
     * Java has become a popular and useful programming language because of its excellent features,
     *  which play a very important role in contributing to the popularity of this language. 
     * The Java features are called “Java BuzzWords”.
     * 
     * Robust
     * Secure
     * Platform Independent
     * Compiled and Interpreted
     * Architectural Neutral
     * Portable
     * Object-Oriented
     * Multi-threaded and Interactive
     * High Performance
     * 
     */

     /**
      * Recursion is the technique of making a method call itself. This technique 
      * provides a way to break complicated problems down into simple problems
      *  which are easier to solve.
      */

      /**
       * In Java, methods and data members can be encapsulated by the following four access specifiers.
       *  The access specifiers are listed according to their restrictiveness order. 
      1) private (accessible within the class where defined) 
      2) default or package-private (when no access specifier is specified) 
      3) protected (accessible only to classes that subclass your class directly
       within the current or different package)
      4) public (accessible from any class)
       */
      
       /**
        * There are 8 primitive datatypes in Java
        * Integers 
       		1 Byte = 1 Byte
       		2 Short = 2 Bytes
       		3 Int = 4 Bytes
       		4 Long = 8 Bytes
       	*Floating type
       		5 float = 4 Bytes
       		6 double = 8 Bytes
       	*Single char
       		7 Char = 2 Bytes
       	*Booleans
       		8 boolean = 1 Bit
       		
       *Non-primitive data type
        	Strings
       		Strings = not defined;
            arrays etc..
        */


// import java.util.Scanner;
// public class MainMethodOverloding {
//     static Scanner sc = new Scanner(System.in);
//     int a, b;
//     public void main(int a, int b){
//         int add;
//         add = a+b;
//         System.out.println("This is the Overload Method");
//         System.out.println(add);   
//     }
//     public static void main(String[] args) {
//         MainMethodOverloding obj = new MainMethodOverloding();
//         System.out.println("Enter first digit from main method");
//         int firstNum = MainMethodOverloding.sc.nextInt();
//         System.out.println("Enter second digit from main method");
//         int secondNum = MainMethodOverloding.sc.nextInt();
//         obj.main(firstNum,secondNum);
//     }

//     public class VariablesInJava{
//         /**
//          * Global variables are normal variables 
//          * we can declare varibles inside class out of methods/functions
//          * static mean single copy we use fixed values only once the variable
//          * is intilization its fixed copy
//          * non-Static variables are multiple copys
//          * y bcoz its create an objects every time
//          * store new values.
//          */
//         double radius;// non-primitive variable
//         static double pie;//primitive variable

//         // this is the non-static method non-static & static variables

//         public void areaOfCircle(double radius){ //method formal arguments
//             this.radius= radius;// we can call non-primitive variables by using this keyword in same class
//             System.out.println(radius*radius+3.41);
//         }

//         //this is static method with local variables
//         public static add(){
//             int i = 10; // it is local variable, non-static type
//             static int j = 20; // it is local variable, static type
//             System.out.println(i+j);
//         }
//         public static void main(String[] args) {
//             areaOfCircle(10.3);
//             add();
//         }

//     }
// }


// public class MethodOverloding{
//     /**
//      *  method overloding rules
//      *  same class member and same method name
//      *  but different formal arguments
//      * 
//      * REAL TIME EXAMPLE is String class methods 
//      * for overloading and overriding.
//      */
//     public static add(int a, int b){
//         int add = a+b;
//         System.out.println(add);
//     }
//     /**
//      * why we need to overload a method
//      * if i want to add two floating numbers
//      * same method to overload
//      * how it is c blow code
//      */
//      public static add(double a, double b){
//          // different in method formal args
//         double add = a+b;
//         System.out.println(add);
//     }
    
//     /**
//      * In compile time, compiler will bind with method formal args
//      * matching it will bind.
//      * whenever args are not matched, compiler will do type cast implicit
//      */
//     public static void main(String[] args) {
//         add(12,23); // int values
//         add(10.23,54.65); // float values
//     }
// }


/**
 * What are methods and explain methods with formal arguments and method with
 * return type?
 */
public class MethodsAndItTypes{
    /**
     * we are using two types of methods in java
     *  1 static methods
     *  2 non-static or instance methods
     * 
     * *********static method*****************
     *  If we can use in front of method signature static keyword its indicates 
     * static method, 
     *  static methods are not inherted, so we can't @override but we can overload these methods.
     *  static methods and static variables are single copies.
     *  
     * **********non-static method *********
     *  If we can write a method signature without static keyword its indicates
     * non-static method.
     *  non-static methods are inherted super-class to sub-Class, we can @Override these methods
     *  as well as overload all so.
     * 
     * **************method return types**********
     * in front of method signature we can write return type 
     * it will returns values that return type only.
     * If we can define return type must be write return statment.
     */

    // static method with Interger(int) return type:
    public static int add(int firstNum, int secondNum){
        int addTwoNums = firstNum + secondNum;
        System.out.println(addTwoNums);
        return addTwoNums;
    }

    // non-static method with double is return type:
    public double add(double firstNum, double secondNum){
        double addTwoNums = firstNum + secondNum;
        System.out.println(addTwoNums);
        return addTwoNums;
    }
    /**
     * the method names are same, but formal args is differnt these type 
     * of method implementations is called method overloading.
     */
    public static void main(String[] args) {
        MethodsAndItTypes obj = new MethodsAndItTypes();
        add(10,20);
        // non-static methods we need to create instance/object for calling methods.
        obj.add(10.20,30.20);
    }
}



