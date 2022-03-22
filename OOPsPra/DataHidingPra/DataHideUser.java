// corruputed file
import java.util.Scanner;
public class DataHideUser{
    // this is the user logic for the DataHiding programming
    public static void main(String[] args) {
        // data hiding abstraction
        // mobile name
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Mobile name : ");
        String mobName = sc.next();
        // mobile price
        System.out.println("\nEnter the Mobile Price : ");
        double mobPrice = sc.nextDouble();
        // mobile quantity
        System.out.println("\nEnter the Mobile Quantity : ");
        int mobQntys = sc.nextInt();
        // passing the values in the
        DataManuHid obj =new DataManuHid();
        obj.setMobileName(mobName);
        obj.getMobileName();
        obj.setMobilePrice(mobPrice);
        obj.getMobilePrice();
        obj.setMobileQnty(mobQntys);
        obj.getMobileQnty();
        obj.display();
    }
}
