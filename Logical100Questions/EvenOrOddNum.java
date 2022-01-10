import java.util.Scanner;
public class EvenOrOddNum {
    public static void main(String[] args) {
     System.out.println("\n Enter your favroit number...");
     Scanner num = new Scanner(System.in);
     int num1 = num.nextInt();
     if(num1%2==0){
        System.out.println(num1+" : it is the Even number...\n");
     }
     else{
        System.out.println(num1+" : it is an Odd number... \n");
     }
     num.close();
    }
}
