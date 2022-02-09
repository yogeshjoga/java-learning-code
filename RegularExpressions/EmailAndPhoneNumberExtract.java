import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAndPhoneNumberExtract {
    public  void phoneAndEmailExtract() throws Exception {
        // taken from user input file and save file name with extension
        System.out.println("\nEnter input file with extension ex: .txt .. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Enter your input file name with extension ");
        String inpFile = sc.nextLine();
        System.out.println("2) Enter your Output file name with extension ");
        String outFile = sc.nextLine();
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        // taken from input
        BufferedReader inpRead = new BufferedReader(new FileReader(inpFile));
        PrintWriter wriFile = new PrintWriter(outFile);
        String lineByLine = inpRead.readLine();

        
        while(lineByLine != null){
            Matcher m = p.matcher(lineByLine);
            while(m.find()){
                wriFile.println(m.group());
            }
            lineByLine = inpRead.readLine();
        }
        sc.close();
        inpRead.close();
        wriFile.close();
        wriFile.flush();

    }
   
    
}
