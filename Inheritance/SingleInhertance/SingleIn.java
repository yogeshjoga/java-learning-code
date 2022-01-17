// this is the sinlge Inhertance 

class Vehicle{ // 1st class it is a parent class
    void fourWheelers(){
        System.out.println("cars");
        System.out.println("bus's");
        System.out.println("mini vans");
        System.out.println("trucks");

    }
}
class Car extends Vehicle{ // this is the child class to Vehicle class
    void enigneSpecfications(){
        System.out.println("Brand is YOGI");
        System.out.println(" 750 cc 8 liter capable, BS6 model");
        System.out.println(" top Speed 490Kmph ");
        System.out.println(" 0-100 take's time is 2.0 Sce only");
        System.out.println("this is the latest model in the market");
        System.out.println("Total cost of the car is 2.5cr only");
    }
}
// this is the main class and main method to call the what ever you want the methods or class's
public class SingleIn {
    static void billa(){
        System.out.println("WELCOME TO THE CARS AND VEHICLS");
    }
    public static void main(String[] args) {
        billa();
        Car cu = new Car();
        cu.fourWheelers();
        cu.enigneSpecfications();
    }
    
}
