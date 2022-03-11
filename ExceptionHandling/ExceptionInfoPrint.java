import java.lang.Throwable;
public class ExceptionInfoPrint {
    /**
     * this is the to print a exception descreption and message
     * ther are three type of methods to print the exceptions
     * 1 is the  ----> e.printStackTrace() we don't need to writ inside the sopln statment
     * 2 is the -----> e.toString() we can writ and print in sopln statment only
     * 3 is the -----> e.getMessage() we can write and print in sopln statment only
     * 
     */
    public static void main(String[] args) {
        System.out.println("\n\nthis is the outer block");
        try{
            System.out.println(10/0);
            //System.out.println(e.printStackTrace);
        }
        catch(ArithmeticException e){
            System.out.println("\nthis is the catch block");
            System.out.println(10/2);

            System.out.println("\n\nthis is the e.printStackTrace() method result ");
            e.printStackTrace();

            System.out.println("\n\nthis is the e.toString method result ");
            System.out.println(e.toString());

            System.out.println("\n\nthis is the e.getMessage() method result ");
            System.out.println(e.getMessage());
         
            
        }
        finally{
            System.out.println("this is the finally block");
        }
    }
    
}
