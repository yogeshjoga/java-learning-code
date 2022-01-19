import java.util.Scanner;
// This is the user logic it as own main method
public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner rad = new Scanner(System.in);
        System.out.println("\nEnter Circle Radius : ");
        double num = rad.nextDouble();
        c1.circleArea(num);
    }
}
 // completly excuted in this program