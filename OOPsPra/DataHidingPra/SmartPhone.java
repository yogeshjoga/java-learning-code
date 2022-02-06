import java.util.Scanner;

public class SmartPhone {
    public static void main(String[] args) {
        SmartPhoneUser obj = new SmartPhoneUser();
        Scanner sc = new Scanner(System.in);
        // input for the smartphone brand name
        System.out.println("\nEnter the smartPhone brandName : ");
        String smName = sc.next();
        // input for the smartphone price
        System.out.println("\nEnter the smartPhone price in the now : ");
        double smPrice = sc.nextDouble();
        obj.setSmartPhoneBrand(smName);
        obj.getSmartPhoneBrand();
        obj.setSmartPhonePrice(smPrice);
        obj.getSmartPhonePrice();
        obj.display();

    }
}
