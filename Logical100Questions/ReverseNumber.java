import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
public class ReverseNumber {
    // question is take number from user and revers the number ex: input 123 output like 321
    public static void main(String[] args) {
        System.out.println("Enter a number...");
        Scanner num = new Scanner(System.in);
        var num1 = num.nextInt();
        int a,sum=0,numm=num1;
        while(num1!=0){
            a=num1%10;
            sum=sum*10+a;
            num1=num1/10;
        }
        System.out.println(numm+" is reversed into "+sum);
        num.close();
    }
    
}
