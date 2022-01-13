import java.util.Scanner;
public class RangeOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
         System.out.println("Enter 1st number to start the finding prime numbers");
         int num1 = num.nextInt();
         System.out.println("Enter 2nd number ");
         int num2 = num.nextInt();
         // outer for loop is to be itrate the counting to starting number to ending number
         for(int i=num1; i<=num2; i++){
                 int a=0;
                 // inner for loop is to be itrate the checking the number is divisible into 2 r not 
                 for(int j=1;j<=i;j++){ // j variable is the counting the itration to end the i values
                     if(i%j==0){  
                          a++;
                        }
                    }
             if(a==2){
                 System.out.println(i);
                }
                
            }
        num.close(); // it's for closing the Scanner class its not mandatory but its better to programming its my style yogesh.....    
    }
    
}
