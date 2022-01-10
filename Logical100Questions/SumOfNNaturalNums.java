import java.util.Scanner;
public class SumOfNNaturalNums {
    public static void main(String[] args) {
        int sumOfNum;
        System.out.println(" Enter a number to check the sum...");
        Scanner num = new Scanner(System.in);
        int num1 =num.nextInt();
        sumOfNum=(num1*(num1+1)/2);
        System.out.println(num1+" : the sum of is : " + sumOfNum);
        num.close();
    }
}
