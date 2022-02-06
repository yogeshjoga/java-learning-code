package DataHiding;

import java.util.Scanner;

public class DataHideUser extends DataHiding {
    // this is the user logic for the DataHiding programming
    public static void main(String[] args) {
        // data hiding abstraction
        // mobile name
        DataHideUser obj = new DataHideUser();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Mobile name : ");
        String mobName = sc.next();
        // mobile price
        System.out.println("\nEnter the Mobile Price : ");
        double mobPrice = sc.nextDouble();
        // mobile quantity
        System.out.println("\nEnter the Mobile Quantity : ");
        int mobQntys = sc.nextInt();

    }
}
