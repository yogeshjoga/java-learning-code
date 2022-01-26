import java.util.Scanner;

public class StudentPropUserLogic {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String stdName = obj.next();
        int rollNum = obj.nextInt();
        double ten10th = obj.nextDouble(),inter = obj.nextDouble(),degree = obj.nextDouble();
        StudentProp newStud = new StudentProp(stdName,rollNum,ten10th,inter,degree);

    }
}
