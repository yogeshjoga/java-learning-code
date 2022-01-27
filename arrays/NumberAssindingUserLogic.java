import java.util.Scanner;
public class NumberAssindingUserLogic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the some values : ");
        int num1 = sc.nextInt();
        int num[] = new int[num1];
       // System.out.printf("Ented the %d array numbers"+num1);
        for(int i=0; i<=num1;i++){
            num[i] = sc.nextInt();
        }
        for (int i : num) {
            System.out.println(i+"");
        }
        NumberAssindingAndDecinding obj = new NumberAssindingAndDecinding(num);
        sc.close();
   
    }
}
