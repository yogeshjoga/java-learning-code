import java.util.Scanner;

public class Cars {
    public boolean carWheels;
    public boolean carSeats;
    public boolean carDoors;
    Scanner sc = new Scanner(System.in);

    public boolean carWe(boolean carWheels){
        if(carWheels==true){
            int noOfWheels = this.sc.nextInt();
            switch(noOfWheels){
                case 1: System.out.println("\n4 Wheels 2 Wheel Drive"+this.carWheels);
                break;
                case 2: System.out.println("\n4 Wheels 4 Wheel Drive"+this.carWheels);
                break;
                case 3: System.out.println("\n6 Wheels 4 Wheel Drive"+this.carWheels);
                break;
                case 4: System.out.println("\n6 Wheels 6 Wheel Drive"+this.carWheels);
                break;
              }
            
        }
        return true;
    }

    public boolean carSe(boolean carSeats){
        if(carSeats==true){
            int noOfCarSeat = this.sc.nextInt();
            switch(noOfCarSeat){
                case 1: System.out.println("\n5 Sitting 5 seats in-cluding driver seat");
                break;
                case 2: System.out.println("\n7 Sitting 7 seats in-cluding driver seat");
                break;
            }
        }
        return true;
    }

    public boolean carDo(boolean carDoors){
        if(carDoors==true){
         this.carDoors = carDoors;
         int noOfCarDoor = this.sc.nextInt();
          switch(noOfCarDoor){
              case 1: System.out.println("\n3 door car without sun-roof");
              case 2: System.out.println("\n5 doors car without sun-roof");
              break;
              case 3: System.out.println("\nNo doors open off-Road vehicle");
              break;
             }
         }
         return true;
    }
    
}
