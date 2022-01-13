import java.util.Scanner; 
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("\n\nEnter a number to find the its prime or not ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int a=0;
        for(int i=1; i<=num1; i++){
            if(i%2==0){
                a++;
            }
        }
        if(a==2){
            System.out.println(num1+" : it the prime number");
        }
        else{
            System.out.println(num1+" : it is not a prime number");
        }
        num.close();
    }
}
