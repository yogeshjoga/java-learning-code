import java.io.FileOutputStream;
import java.util.Scanner;

public class SecondIo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name with extension");
        String fileName = sc.next();
        
        try {
            FileOutputStream fileI = new FileOutputStream("G:\\" + fileName);
            System.out.println("Enter the req data ");
            String inPutValues = sc.nextLine();
            byte ch[] = inPutValues.getBytes();
            fileI.write(ch);
            fileI.close();
        } catch (Exception e) {
            System.out.println(e);

        }
        sc.close();

    }
}

