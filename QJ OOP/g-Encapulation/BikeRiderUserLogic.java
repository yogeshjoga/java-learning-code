import java.util.Scanner;

public class BikeRiderUserLogic {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the 1st rider bike specfications ");
        String bikeName = sc.next();
        int transmission = sc.nextInt();
        double mileage = sc.nextDouble(), topSpeed = sc.nextDouble();
        BikeRider bike = new BikeRider(bikeName,mileage,topSpeed,transmission);
        bike.display();
    }
}
