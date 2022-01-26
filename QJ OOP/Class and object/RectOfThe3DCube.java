import java.util.Scanner;
public class RectOfThe3DCube {
    
        public static void main(String[] args) {
            Scanner inPut = new Scanner(System.in);
            System.out.println("Enter the 2D Rectangle Dimensions in Length and Bearth");
            double num1 = inPut.nextDouble(),num2 = inPut.nextDouble();
            System.out.println("Enter the 3D Rectangle Dimensions in Length, Bearth and Height");
            double num3 = inPut.nextDouble(),num4 = inPut.nextDouble(),num5 = inPut.nextDouble();
            ReactAngle3D areaOfRect = new ReactAngle3D(num1, num2);
            ReactAngle3D areaOf3d = new ReactAngle3D(num3, num4, num5);
            inPut.close();
        }
    
    
    
}
