import java.util.Scanner;

public class BikeRiderUserLogic {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("\nEnter the 1st rider bike specfications \n1 : Bike name \n2 : Bike Max Speed limit \n3 : Gears \n4 : milage \n5 : Top Speed Ride");
        String bikeName1 = sc.next();
        double maxSpeed1 = sc.nextDouble();
        int transmission1 = sc.nextInt();
        double mileage1 = sc.nextDouble(), topSpeed1 = sc.nextDouble();
        BikeRider bike = new BikeRider(bikeName1,mileage1,topSpeed1,transmission1);
        bike.display();
        bike.setTopSpeed(maxSpeed1);
        bike.display();
        sc.close();
    }
}
