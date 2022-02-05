import java.util.Scanner;

public class VehilcleUserLogic {
    Bus objBus = new Bus();
    TwoWheelerBike objBike = new TwoWheelerBike();
    Scanner sc = new Scanner(System.in);
    public void inPutsOfBike(){
        // no of wheels in bike
        System.out.println("\nEnter the bike Number of wheels : ");
        int bikeWheels = this.sc.nextInt();
        this.objBike.noOfWheels(bikeWheels);
        //top speed of bike
        System.out.println("\nEnter the bike TopSpeed : ");
        double bikeTopSpeed = this.sc.nextDouble();
        this.objBike.topSpeed(bikeTopSpeed);
        // engine capcity of bike
        System.out.println("\nEnter the bike Engine Capacity cc : ");
        double engineBike = this.sc.nextDouble();
        this.objBike.engineCapcity(engineBike);
        // no of cylinder in bike
        System.out.println("\nEnter number of cylinder in Bike : ");
        int cylindersBike = this.sc.nextInt();
        this.objBike.numberOfCylinders(cylindersBike);
        // maximum torque of bike is
        System.out.println("\nEnter Bike Torque : ");
        double torqueBike = this.sc.nextDouble();
        this.objBike.torqueOfVehicle(torqueBike);
    }
    public static void main(String[] args) {
        VehilcleUserLogic objUser = new VehilcleUserLogic();
        objUser.inPutsOfBike();
    }
}
