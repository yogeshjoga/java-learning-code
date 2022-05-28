public class MainNote {
    /**
     * there are two types of castings
     * 1 Is primitive type casting
     * 2 non-primitive type casting or object type
     * in primitive type casting two types are there
     *    1 autowidaning / implicit type casting
     *    2 narrowing/ explicit type casting
     *   autowiding is the type casting 
     *   like 
     * ex: byte -> short -> cahr -> int -> long -> float -> double -> 
     *  it will convert by default compiler like smaller data type to bigger datatype 
     * narrowing 
     *    ex: double -> float -> long -> int -> char -> short -> byte
     *   we will explictly cast the bigger data type to smaller data type in this process
     *         we loose some values.
     * 
     * non-primiteve type casting
     *    upcasting 
     *    downcasting
     * 
     * upcasting
     *  upcasting is parent to child 
     *  it means child object type to convert parent object type
     * ex:  Parent p = (Parent)Child 
     * 
     * downcasting
     * it mean parent object type to convert child type object.
     *  we can't direct cast this type 
     *  1st we can do upcast after we will go for down cast
     * 
     *  ex: Child c = (Child)Parent
     */




     /**
      * Conditional Operator or Ternary Oparator
      * It is the decision making in  place of longer if and else
      *  Syntax of the conditional oparator is
      *    condition ?  true : false
      *    2+2 ? 4 : error
      */


      /**
       * Conditional statments
       *  usual logical conditions 
       *  we can use conditions inside the conditon block
       *  it will given the boolean values
       *  like ture or false
       *  if it is true block is excuted orther wise block is terminated
       *   like some of the conitional statements are using in programming
       *   if
       *   else
       *   else if
       *   switch
       *   break and contiune (these are to control the conditons)
       *  syntax:
       *    if(conditon){
       *      block of code
       *    }
       *    else if( condition ){
       *    block of code
       *    }
       *    else{
       *    only result of code
       *    }
       *    
       *    switch ( value){
       *    case 1: {block of code};
       *    case 2: {block of code};
       *    must be matched to the value of datatype to case datatype
       *    }
       */

       /**
        * loops 
        *  loops are excuted a block of code as long as specifed condition is reached
        *  Loops are handy because they save time, reduce errors, and they make code more readable.
        *  list of loops:
        *   while
        *   do-while
        *   for 
        *   for each(for arrays)
        *   while(conditon){
        *   block of code
        *   }
        * 
        *  do{
        *   block of code
        *   }
        *   while(condition);
        *   
        *   for(statement 1; statement 2; statement 3)
        *   for(min position; max position; increment){
        *    block of code
        *   }
        *   
        *   for each 
        *    for(datatype variable : )
        */
            /**
             * public static void main (String [] args){}
             *  public 
             *     it is an Access modifier, which specifies from where and who can access the method.Making
             *     the Main() method pulbic makes it golobally avavilable.
             *  static
             *      it is a keyword that is when associated with a mehod, makingit a class-realted method.
             *        the main() method is static o that jvm can invoke it without instantiating the class.
             *  void 
             *      it is a keyword and is used to specify that a method doesn't return anyting.
             *  main
             *     it is the anme of the java main method. it is the identifier that the jum looks for
             *        as the starting point of the java program.It's not a keyword.
             *  String[] args
             *      it stores JAVA command-line arguments and is an array of type JAVA.LANG.STRING
             *          class. here thename of the string is args but it is nor fixed an th user can 
             *              use any name in place of it.
             */


             /**
              * we can't override the main method
              *  but we can overload the main method 
              *     JVM will search main method actuall stucture only
              */


             /**
              * in java static binding refers to the execution of a program wher etype of object
              * is determined/ known at compile time when compler executes the code it know the typeof 
              * object or class to which object belongs. while in case of dynamic binding.
              * 
              */

             /**
              *  static members
              * static variables can be accessed using class name.
              * static variables can be accessed by staic and non-static methods.
              * static variables reduce the amount of memory used by a program.
              * staic variables are shared among all instances of a class.
              * static variables is like a global variables and is available to all methods.
              * 
              * Non-static variable
              * non-static variables can be accessed using instance of a class.
              * non-static variables cannot be accessed inside a static method.
              * nonstatic variables do not reduce the amount of memory used by a program
              * non static variables are specific to that instance of class.
              * non staic variable is like a local variable and they can be accessed through
              *   only instance of a class.
              * 
              */

              /**
               * the dimond problem when it comes to inheritance. java does not
               * support hte multiple inheritance because of the diamond problem.
               * java does not allow is multiple inheriance where one class can inherit
               * properites from more thean one class. it is konow as the diamond problem.
               * ambiguity / deadly dimond of death. 
               */

               /**
                * interface 
                * interface is blue print of a class. it has static constants and abstact methods.
                * inteface also represents the IS-A relationship.
                *  there are some resons of interface is 
                *  intrface contains abstract methods.
                *  we can archive the 100% of abstraction.
                *  it is used to achieve abstraction
                *  by interface we can support the funcationality of mutltiple inheritnce.
                * it can be used to achieve loose coupling.
                */
    /**
     * Abstraction
     * showing functionality and hiding internall implementation
     * ex: whats app it's showing only functionlity and hiding 
     * implementation like what code inside and how photos are sharing
     * how msgs are encripted.
     */

     /**
      * method overloading
      *  must be same method name
      *  must be in different method arguments
      *  method shoud either static are non-static
      *  return type same are different
      * 
      * method overriding
      * must be inherted from parent class or interface.
      * must be same method signature with args
      * we can override only non-static methods.
      * return type must be same 
      */

      /**
       * we can't override the finall class method
       * why because finall class members are not accessable to
       *  orther class and finall class member also can't 
       * inhertede
       */

       /**
        * entends 
        *  Extends means it is a inhertance conpect 
        *   we can inherte to parent to child class objects
        *  
        * implements
        *    mean we can implements  the interface methods 
        *  which methods does't conations any implementation.
        * 
        */

        /**
         * Encapulation
         *   it is a mechanism of rapping the dataand code acting onthe data
         * together as a single unit.
         *  To achieve encapsulation 
         *  declare the variables of a class as private
         * provide public setter and getter metods to modfiy and view the 
         * variables values.
         */

         /**
          * polymorphism
          *   A task is performed as many ways.
          *    for example is :
          *        human, we are behave different in college, with friends,and orther.
          * 
          * there are two types of polymorphisms
          *   compile time polymorphism
          *    run time polymorphism
          *  compile time polymorhism is method overloading
          *  run time polymorphism is method overriding. 
          */

          /**
           * Inhertiance
           *   acquire all the propertites and beheaviors 
           * from parent class to child class.
           *   for example is:
           *       family grandfather to father to grand son
           *    some beheaviors can acqurie grand son from grandpa
           * 
           *   types of inhertinces
           *  sigle 
           *  mutli level
           *  multipule inhertance (java not supported but we can achive by using
           *  inteface)
           *  herirarical inhertance
           *  hybrid inhertance(java not supported)
           */

           /**
            * IS-A relationship whenever one class inherits another class,
            * it is called an IS-A relationship
            * Is-A relationship can simply be achieved by using extends keyword
            * 
            * advantages 
            *    code reusability
            *    reduce redundancy
            * 
            * Has-A relationship whenever an instance of one class is 
            * used in another class it is called HAS-A relationship.
            *  car has an engine
            *  bike has a handle
            *  bike has an exhust
            */


            /**
             * Arrays are used ot store multiple values in a single variable.
             * Array is an object which can store the list of objects.
             *  it supports primitive and objects
             * 
             * Disadvantages
             *  1 its fixed in size.
             *  2 its support only homogenius values.
             */

             /**
              * one dimensional array
              *   it is a list of the variable fo similar datatypes.
              *   it allows random access and all the elements can be
              *     accessed with the heopof therir indexs.
              *  the size of the array is fixed
              *  
              * Two dimensional array
              *   it is the list of list of the avariable of the same data types.
              *   it is also know as the matrix.
              *   its dimension can be increased form 2 to 3 and 4 so on.
              *   the most common multidimesnsional array is a 2D array.
              */

              1.	import java.util.ArrayList;  
2.	import java.util.Collection;  
3.	import java.util.Collections;  
4.	import java.util.Comparator;  
5.	import java.util.Iterator;  
6.	import java.util.List;  
7.	  
8.	public class ReverseArrayList {  
9.	public static void main(String[] args) {  
10.	     List list = new ArrayList<>();  
11.	     list.add(10);  
12.	     list.add(50);  
13.	     list.add(30);  
14.	     list.add(60);  
15.	     list.add(20);  
16.	     list.add(90);  
17.	       
18.	     Iterator i = list.iterator();  
19.	     System.out.println("printing the list....");  
20.	     while(i.hasNext())  
21.	     {  
22.	         System.out.println(i.next());  
23.	     }  
24.	      
25.	    Comparator cmp = Collections.reverseOrder();  
26.	    Collections.sort(list,cmp);  
27.	     System.out.println("printing list in descending order....");  
28.	     Iterator i2 = list.iterator();  
29.	     while(i2.hasNext())  
30.	     {  
31.	         System.out.println(i2.next());  
32.	     }  
33.	       
34.	}  



1. import java.util.ArrayList;
2. import java.util.Collection;
3. import java.util.Collections;
4. import java.util.Iterator;
5. import java.util.List;
6.public class ReverseArrayList {
7.public static void main(String[] args) {  
8.	     List list = new ArrayList<>();  
9.	     list.add(10);  
10.	     list.add(50);  
11.	     list.add(30);  
12.	     Iterator i = list.iterator();  
13.	     System.out.println("printing the list....");  
14.	     while(i.hasNext())  
15.	     {  
16.	         System.out.println(i.next());  
17.	     }  
18.	     Iterator i2 = list.iterator();  
19.	     Collections.reverse(list);  
20.	     System.out.println("printing list in reverse order....");  
21.	     while(i2.hasNext())  
22.	     {  
23.	         System.out.println(i2.next());  
24.	     }  
25.	    }26.
}

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("db.properties");
        Properties p = new Properties();
        p.load(reader);
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}

} 
