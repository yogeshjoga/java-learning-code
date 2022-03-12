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
