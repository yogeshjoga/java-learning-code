import java.util.Scanner;
public class PositiveOrNegitiveNO {
    public static void main(String[] args) {
        System.out.println("\n Enter a number to check the postive or negitive number........ ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        if(num1>0){
            System.out.println(num1+" : This is the Positive number...");
        }
        else if(num1<0){
            System.out.println(num1+" : This is the Negitive number...");
        }
        else{
            System.out.println(num1+" : This is the Zero...");
        }
        num.close();
    }
    
}
