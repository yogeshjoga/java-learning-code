import java.util.Scanner;

public class Kippili {
    //global variable
    static double pie = 3.17;
    
    public void areaOfCircle(double radius) {
        // local variable
        radius = radius*radius*pie;
        System.out.println(radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius ");
        // loacal variable
        int radius = sc.nextInt();
        Kippili obj = new Kippili();
        obj.areaOfCircle(radius);
    }
    
}
