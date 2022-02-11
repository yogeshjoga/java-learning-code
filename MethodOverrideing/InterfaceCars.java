import java.lang.annotation.Annotation;
public class InterfaceCars implements MyFirstIntraface, SecondIntreface {
    /**
     * i can't use extends keyword? why bcoz
     * it is inherted to parent to child 
     * but im inherted to  two parent objects and one child object
     * thats y extends keywords not supported to at a time we inherted in one object class only
     * but implement mean we can implement some methods 
     * so we will use these implement keyword to INTERFACE ABSTRACT methods we will implemented in this calss
     * that it enjoy the coding
     * happy coding buyy dear YOGI .........
     */
    String brand;
    int front,back,frontSeat,backSeat;
    double milage;
    @Override  // it is the annotation it's used to validation to perfect override the methods 
    public void cars(){
        System.out.println("\n\nthis car model is the MM vip s8 ");
        System.out.println("This is the most exapansive car in india : ");
    }
    @Override 
    public void carsParts(){
        System.out.println("\n\nengine");
        System.out.println("Hydrolic brackes");
        System.out.println("it as four wheels\n\n");
    }

    @Override
    public int carsNumOfseats(int frontSeat,int backSeat){
        int total;
        this.frontSeat = frontSeat;
        this.backSeat = backSeat;
        total = this.frontSeat + backSeat;
        System.out.println("\n\nThis is the carNumOfseats mehods  : "+total);
        return total;
    }
    @Override
    public int carWheels(int front, int back){
        int total;
        this.front = front;
        this.back = back;
        total = this.front + this.back;
        System.out.println("Total car Wheels is : "+total);
        return total;
    }
    @Override
    public double carMilage(double milage){
        this.milage = milage;
        System.out.println("Your car milage is : "+this.milage);
        return this.milage;
    }
    @Override
    public String carBrand(String brand){
        this.brand = brand;
        System.out.println("Your car barnd Name is  : "+this.brand);
        return this.brand;
    }
}
