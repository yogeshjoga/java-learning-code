import java.util.Scanner;

public class SumOfNumber {
    // sum of the numbers if we give input as 123 it mean 1+2+3=6 it is the output
    public static void main(String[] args) {
        int a, sum = 0;
        System.out.println("Enter a number");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();

        while (num1 != 0) {
            a = num1 % 10;
            sum = sum + a;
            num1 = num1 / 10;
        }
        System.out.println(sum);
        num.close();
    }

}
