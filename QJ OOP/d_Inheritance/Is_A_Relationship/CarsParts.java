import java.util.Scanner;

public class CarsParts extends Cars {
    public void engine(){
        System.out.println("\nThe engine specefictions is the given below : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tTypes of engines\n1) 2 Cylinder 200mm v2 2 liter turbo engine \n2) 2 Cylinder 400mm v2 4 liter turbo engine");
        System.out.println("3) 4 Cylinder 400mm v3 4 liter turbo engine \n4) 4 Cylinder 600mm v3 4 liter turbo engine");
        int engineTypes = sc.nextInt();
        switch(engineTypes){
            case 1 : System.out.println("2 Cylinder 200mm v2 2 liter turbo engine");
            break;
            case 2 : System.out.println("2 Cylinder 400mm v2 4 liter turbo engine");
            break;
            case 3: System.out.println("4 Cylinder 400mm v3 4 liter turbo engine");
            break;
            case 4: System.out.println(" 4 Cylinder 600mm v3 4 liter turbo engine");
            break;
            default : System.out.println("choose the your engine type correctly ");
        }
    }
    public static void main(String[] args) {
        CarsParts obj = new CarsParts();
        obj.engine();
    }
}
