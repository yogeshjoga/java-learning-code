import java.util.Scanner;
public class LeapYearOrNot{
    public static void main(String[] args) {
        System.out.println(" Enter the year to check the leap year or not");
        Scanner num = new Scanner(System.in);
        int year = num.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+" : it is the leap year enjoy the year...");
        }
        else{
            System.out.println(year+" : is the not leap year!");
        }
        num.close();
    }
}