import java.util.Scanner;

public class CarsParts extends Cars {
    Scanner sc = new Scanner(System.in);
    CarsParts obj = new CarsParts();
    public void engine(){
        System.out.println("\nThe engine specefictions is the given below : ");
        System.out.println("\n\tTypes of engines\n1) 2 Cylinder 200mm v2 2 liter turbo engine \n2) 2 Cylinder 400mm v2 4 liter turbo engine");
        System.out.println("3) 4 Cylinder 400mm v3 4 liter turbo engine \n4) 4 Cylinder 600mm v3 4 liter turbo engine");
        int engineTypes = this.sc.nextInt();
        switch(engineTypes){
            case 1 : System.out.println("Your car is 2 Cylinder 200mm v2 2 liter turbo engine");
            break;
            case 2 : System.out.println("Your car is 2 Cylinder 400mm v2 4 liter turbo engine");
            break;
            case 3: System.out.println("Your car is 4 Cylinder 400mm v3 4 liter turbo engine");
            break;
            case 4: System.out.println("Your car is 4 Cylinder 600mm v3 4 liter turbo engine");
            break;
            default : System.out.println("choose the your engine type correctly ");
        }
    }
    public void fuelType(){
        System.out.println("\n1) Petrol Engine \n2) Diesel Engine");
        int fuelType = this.sc.nextInt();
        switch(fuelType){
            case 1: System.out.println("Your car fuel Type is Petrol Engine");
            break;
            case 2: System.out.println("Your car fuel Type is Diesel Engine");
            break;
        }
    }
    

    public static void main(String[] args) {
        CarsParts obj = new CarsParts();
        obj.engine();
        obj.fuelType();
        obj.carWe(true);
        obj.carSe(true);
        obj.carDo(true);
    }
}
