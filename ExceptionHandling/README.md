# This is the java exception Handling 

    What is the exception 
     The unwanted , unexecpted , accidently errors in code it 
     will raise the run time or compile time
     is called the exception.

    In exception handling
    there is keywords are in
        1 try  -----> it is managed the risk code.
        2 catch -----> it is managed the exception handling code.
        3 throw -----> it is used to created the user defined exception to throw the JVM.
        4 throws -----> it is managed to the checked exceptions.
        5 finally -----> it is used the clean-up try block open conncetions.
        6 assert

     the main class is in exception handling 
     throwable class and child classes are  exception and errors
      
      there is 2 types of exceptions in java
              1 is the checked exception
                        in checked exception 
                             1 is the fully checked exception
                             2 partial checked exception
                             
              2 is the uncheked exception

    what is the checked exception 
      in checked exception compiler will checked it is called checked exception
    
    what is unchecked exception
        In uncheked exeception run time JVM will checked the exceptions 
        is called unchecked exceptions

# now we will go to the real world exception handling some examples we will do
    first we need syntax
    // this simple syntax for exception handling
    1
       try{
           statment();
       }
      catch(ArithmaticException e){
          statments();
          statments();
      }
      finally{
          statment
      }

    // this the multiple try and catch blocks 
    // most of times we will use this only 
    //  the best programmer practice

    2
    try{
        statments
    }
    catch(ae){
        statment
    }
    catch(io){
        statment
    }
    catch(sql e){
        statment
    }
    finally{
        statment
    }


    what is the finally keyword 
         it is the exception keyword. it is used to clean up code 
         in the exception and to over come the return statment.

    finally block is the excute either exception is raised r not 
     it will automatically excuting 

     try{
         statment // first excute this statment after goto finally block
         return
     }
     catch{

     }
     finally{
         clear the code // after try block before return statment it will overcome and excuted
     }

# throw and throws keywords 
   the throw keyword is the user defined exception
    we can create the new object from user defined object to raise the excetion in run  time

    throws is the compile time exception 
    by using throws exception

     how to create the user defined exception by using a throw keyword
```java

     import java.lang.Exception;
     import java.util.Scanner;
     public class ThrowsException {
    /**
     * this programm is the user based programm
     * so we need some rules must follow 
     *  1st rule is the int to int divisible
     *  2nd double to int it will not raise the exception 
     *   it gives the infinite answer
     *  so we will go the the int to int 
     *   take inputs from user if user given zero 0 it will 
     *  go if block if block should try to raise the exception
     *  and it will alternate catch will be raise the answer
     *  will be divisible number is not valid so 
     *  this exception will raised
     *  that's it yogi........
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divison nubmer");
        double div = sc.nextDouble();
        System.out.println("Enter ther divisible number");
        double divb = sc.nextDouble();
        sc.close();
        // now i am goto use exception handling
        if(divb==0){
         try{
         //if(divb==0){
           System.out.println((int)div/(int)divb);
            }
        
         catch(Exception e){
            //System.out.println("Enter the correct divisible number ");
            throw new ArthematicException("This is the invalid divisible number");
           // e.printStackTrace();
            }
          finally{
            System.out.println(" you use math on java code");
            }
        }

        // now i can go for the calculate the 
        else{
            System.out.println(div/divb);
        }
    }
    
 }
```java


# WHAT IS THE DIFFERENT B/W FINAL, FINALLY, AND FINILIZED() METHOD
   
```java

    1 final is the acces modifer 
         it is used to classes, methods, variables
           In classes we can't extend r inherted the classes onec we put final keyword
             In methods we can't override the methods
               In variable we can't re assign the values r update the values
    
    2 finally it is the block in exception handling 
        it is used to in exception handling to code clean-up
            if any connection is opened after try block is excuted 
               it is to be the clean-up all open connections
    
    3 finilazed() it is the method 
        it is used in GARBAGE COLLECTOR
            whenever GARBAGE COLLECTOR is ready to distroy any object
               first GC call's the finilazed method it will clean up all connections opened 
                 in distroy object.

    DIFF B/W THE FINALLY AND FINILIZED() BOTH ARE THE CLEAN-UP CODES 
     
     The main difference is the finally and finilized() method 
      the finally block is only work with exception handling try block clean-up code only
      
      The finilized() method is work with the Garbage collection whenever GC will goto distroy 
      the object. that object will any open connections will remove the connecton and clean-up
      code.

```
# there are some most of time we can see this exceptions in our dalily coding practices
  1 ArrayIndexOutOfBounceException
  2 NullPointerException
  3 StackOverFlow
  4 ClassCastException
  5 NoClassDefFoundError
  6 ExceptionInIntilizationError
  7 IllegalFormatException
  8 IllegalStatException
  9 AsserionError



  that it yogi it is your own note don't feel shy
   your rock😍🤣🤣🤣


    