import java.util.Scanner;

public class IntrafaceUserLogic extends InterfaceCars {
    int frontSeat,backSeat,front,back;
    double milage;
    String  brand;
    IntrafaceUserLogic obj1 = new IntrafaceUserLogic();
    Scanner sc = new Scanner(System.in);
    public void inPWheels(){
        System.out.println("\nEnter the your wheels front and back : ");
        this.front = this.sc.nextInt();
        this.back = this.sc.nextInt();
        this.obj1.carWheels(this.front,this.back);

    }

    public void inpSeats(){
        System.out.println("\nEnter your car seats front and back ");
        this.backSeat = this.sc.nextInt();
        this.frontSeat = this.sc.nextInt();
        obj1.carsNumOfseats(this.frontSeat,this.backSeat);
    }
    public void inpMilage(){
        System.out.println("\nEnter your car milage : ");
        this.milage = this.sc.nextDouble();
        this.obj1.carMilage(this.milage);
    }
    public void inpBrand(){
        System.out.println("\nEnter your car Brand : ");
        this.brand = this.sc.nextLine();
        this.obj1.carBrand(this.brand);
    }
    public static void main(String[] args) throws Exception {
        
        IntrafaceUserLogic obj = new IntrafaceUserLogic();
        obj.cars();
        obj.carsParts();
        obj.inpSeats();
        obj.inPWheels();
        obj.inpMilage();
        obj.inpBrand();
    }
}
