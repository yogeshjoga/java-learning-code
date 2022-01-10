import java.util.Scanner;
public class Greatest3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the three number to compar the which is the grather?");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" : is the grather ");
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2+" : is the grather ");
        }
        else if (num3>num1 && num3>num2){
            System.out.println(num3+" : is the grather ");
        }
    }
    
}
