# This is the java exception Handling 

    What is the exception 
     The unwanted , unexecpted , accidently errors in code it 
     will raise the run time or compile time
     is called the exception.

    In exception handling
    there is keywords are in
        1 try
        2 catch
        3 throw
        4 throws
        5 finally
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

    