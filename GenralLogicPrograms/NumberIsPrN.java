import java.util.Scanner;
public class NumberIsPrN {
    public static void main(String[] args) {
        Scanner inputNoIs = new Scanner(System.in);
        System.out.println("Enter a number to check the positive or not...");
        int num = inputNoIs.nextInt();
        if(num==0){
            System.out.println(num+" is the Zero type again!");
        }
        else if(num>0){
            System.out.println(num+" is the Positive ...");
        }
        else{
            System.out.println(num+" is the Negitive ...");
        }
        out.exit();

    }
    
}
