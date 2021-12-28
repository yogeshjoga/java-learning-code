import java.util.Scanner;
public class FirstProgram{
    static int addition(int a, int b){
        int c= a+b;
        System.out.println(a+" + "+ b+ " = " +c);
        return c;

    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner intA = new Scanner(System.in), intB = new Scanner(System.in);
        int a=intA.nextInt();
        
        int b = intB.nextInt();
        addition(a,b);

    }

}