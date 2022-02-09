import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFilter {
    public void phoneNumberFilter()throws Exception{
        // to take files from end user 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\nThis is the phone number filter app \nEnter the file name with extension");
        String inPutFile = sc.nextLine();
        System.out.println("\nEnter the extract phone numbers storing file name with extension ");
        String ouTputFile = sc.nextLine();
        // End user task was completed now write the business logic
        // this is the target value to find pattern this is the phone number in india code
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        // this is the input taken file to passing 
        BufferedReader readInputs = new BufferedReader(new FileReader(inPutFile));
        // now write the pattern values into new file
        PrintWriter writeOutPut = new PrintWriter(ouTputFile);
        // String to read line by line in the give file and search the pattern 
        String lineByLine = readInputs.readLine();
        // now start searching the pattern into given file okay
        // we need to use the loop why because we will n number of time to search the pattern into whole file
        while(lineByLine!= null){
            // now we can matcher the given pattern to file content so we will use matcher class and mather method and passing read input file
            Matcher matherPattern = p.matcher(lineByLine);
            while(matherPattern.find()){
                writeOutPut.println(matherPattern.group());
            }
            lineByLine = readInputs.readLine();
        }
        sc.close();
        readInputs.close();
        writeOutPut.close();
        writeOutPut.flush();

    }
    
}
