import java.lang.annotation.Annotation;
public class InterfaceCars implements MyFirstIntraface {
    @Override
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
    public int carsNumOfseats(){
        int total;
        total = 2 + 2;
        System.out.println("\n\nThis is the carNumOfseats mehods  : "+total);
        return total;
    }
}
