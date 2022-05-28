import java.util.Scanner;
public class LeapYearOrNot{
    public void rangeYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting year");
        int start = sc.nextInt();
        System.out.println("Enter ending year");
        int end = sc.nextInt();
        while(start < end){
            if ((start % 4 == 0 && start % 100 != 0) || start % 400 == 0){
                System.out.println(start+" It is the leap year ");
            }
            start++;
        }
    }


    public void currentYear(){
        System.out.println(" Enter the year to check the leap year or not");
        Scanner num = new Scanner(System.in);
        int year = num.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " : it is the leap year enjoy the year...");
        } else {
            System.out.println(year + " : is the not leap year!");
        }
        num.close();
    }


    public static void main(String[] args) {
        LeapYearOrNot obj = new LeapYearOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1) Current year check \n 2) Range of the years");
        int option = sc.nextInt();
        switch(option){
            case 1 : obj.currentYear();
            break;
            case 2 : obj.rangeYear();
        }
        
     
    }
}