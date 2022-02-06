import java.util.Scanner;

public class TightlyEncapUser extends TightlyEncap {
       public static void main(String[] args) {
           TightlyEncapUser obj = new TightlyEncapUser();
           Scanner sc = new Scanner(System.in);
           System.out.println("\nEnter your Car Name : \nEnter your car wheels : \nEnter your car Seat Size : ");
           String carBrand = sc.next();
           int numWheels = sc.nextInt();
           double numSeats = sc.nextDouble();
           obj.setCarName(carBrand);
           obj.getCarName();
           obj.setNumOfWheels(numWheels);
           obj.getNumOfWheels();
           obj.setNumOfSeats(numSeats);
           obj.getNumOfSeats();
           obj.display();
       }
}
