import java.util.Scanner;
public class SumOfNumByUsingLoop {
    public static void main(String[] args) {
      int sum=0;
      System.out.println(" Enter a number to find the sum of...");
      Scanner num = new Scanner(System.in);
      int num1 = num.nextInt();
      for(int a=1;a<=num1;a++){
        sum=sum+a;
      }
      System.out.println(num1+" : The sum of number is " +sum );
      num.close();
    }
}
