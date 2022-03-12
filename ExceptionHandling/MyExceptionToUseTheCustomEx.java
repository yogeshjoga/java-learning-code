import java.util.Scanner;
public class MyExceptionToUseTheCustomEx {
    public static void main(String[] args) throws ThrowUserException{ 
        /**
         * 1st we must be throws the exception in the method 
         *  2nd thing is we can create a exception object
         *  that's it 
         *  yogi.....
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdarw amout");
        double withdrawAmout = sc.nextDouble();
        sc.close();
        double blanceAmt = 1000.23;
        if(blanceAmt<withdrawAmout){
           throw new ThrowUserException("Insuffcent Blance in your Bank Blance sorry! ");
           // exception object creation
        }
        else{
            System.out.println(" Collect your Amount ");
            System.out.println(" ThankYOu!!! ");
        }
    }
    
}
