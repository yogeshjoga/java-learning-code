import java.util.Scanner;
public class UserLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Enter the BrandName\n2) Enter the Model Name\n3) Enter the TopSpeed\n4) Enter ther total Gears\n5) Enter the Bore Diameter");
        String brandName = sc.nextLine();
        String modelName = sc.nextLine();
        double topSpeed = sc.nextDouble();
        int totalGears = sc.nextInt();
        double boreDia = sc.nextDouble();
        realTimeExample obj = new realTimeExample(brandName,modelName,topSpeed,totalGears,boreDia);
        System.out.println(obj);
    }
    
}
