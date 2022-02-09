import java.util.Scanner;

public class FilterApp {
   
    public static void main(String[] args)throws Exception {
        PhoneNumberFilter obj1 = new PhoneNumberFilter();
        EmailFilter obj2 = new EmailFilter();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\tSELECT THE OPTION \n1) Phone Number Filter \n2) Email Id Filter ");
        int objs = sc.nextInt();
        switch(objs){
            case 1: obj1.phoneNumberFilter();
            break;
            case 2: obj2.emailFilter();
            break;
        }
        
    }
    
}
