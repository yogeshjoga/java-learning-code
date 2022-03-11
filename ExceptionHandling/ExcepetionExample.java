import java.lang.Throwable;
public class ExcepetionExample {
    public static void main(String[] args) {
        System.out.println("\n\nException Handling blocks");
        try {
            System.out.println("\n\nThis is the TRY block");
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("\n\nThis is the catch block");
            System.out.println(10/2);
        }
        finally{
            System.out.println("\nThis is the finally block to excute\n");
        }
    }
    
}
