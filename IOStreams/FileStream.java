import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileStream{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileOut = sc.next();
        File f = new File("G:\\"+fileOut);
        f.createNewFile();
        FileWriter fw = new FileWriter(f,true);
        System.out.println("Enter the content here.....");
        String inputF = sc.next();
        fw.write(inputF);
        fw.flush();
        fw.close();
        sc.close();
    }
}