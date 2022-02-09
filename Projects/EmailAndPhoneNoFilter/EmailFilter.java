import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFilter {
    public void emailFilter()throws Exception{
        // take a inputs from end user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email list file with extension ");
        String inPutFile = sc.nextLine();
        System.out.println("Enter your email filter output file name with extension ");
        String ouTputFile = sc.nextLine();
        // end user work was completed 

        // lets move on the business logic bro's my dear yogi 

        // this pattern for email  only google mails only for like @gmail.com extensions
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail.com");
        // now we will go for the input file to import the our enivormental
        BufferedReader readInput = new BufferedReader(new FileReader(inPutFile));
        // write the pattern matching to save the new file so we need a new output file to create
        PrintWriter writeOutput = new PrintWriter(ouTputFile);
        // we need to change pattren and file datatype will same we need to convert
        // in file pattern will check like line by line so 
        String lineByLine = readInput.readLine();
        // now start the finding pattern 
        // we need to use loop why bcoz n number of times we check the file
        while(lineByLine != null){
            // matcher class and matcher method will user the check where ever out req pattern will caught
            Matcher m = p.matcher(lineByLine);
            while(m.find()){
                writeOutput.println(m.group());
            }
            lineByLine = readInput.readLine();
        }
        sc.close();
        readInput.close();
        writeOutput.flush();
        writeOutput.close();
    }
    
}
