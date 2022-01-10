import java.util.Scanner;
public class GreastNum {
    public static void main(String[] args) {
        System.out.println("Enter two number to find the which is grater...");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if(num1>num2){
            System.out.println(num1+" : it is the grather than : "+ num2);
        }
        else if(num2>num1){
            System.out.println(num2+" : it is the grateher than the : "+ num1);
        }
        else{
            System.out.println(num1+" and "+num2+" is equal to each orther..");
        }
        num.close();
    }
    
}
