import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersExtractFromFile {

    /**
     * put exceptions from main method if any case forgot yogi u will getting lot of exceptions
     * BufferReader is the class it is used to read the input files like any extension
     * PrintWriter is also the class it is use to write a output file. it given output file what u want extensions
     * String class readLine method used to to line by line read the string formate
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        BufferedReader readFileFromInput = new BufferedReader(new FileReader("input.txt"));
        PrintWriter writeFileFromOutput = new PrintWriter("output.txt");
        String checkingLineByLine = readFileFromInput.readLine();
        while(checkingLineByLine != null){
            Matcher patternMatching = p.matcher(checkingLineByLine);
            while(patternMatching.find()){
                writeFileFromOutput.println(patternMatching.group());
            }
            checkingLineByLine = readFileFromInput.readLine();
        }
        writeFileFromOutput.flush();
        writeFileFromOutput.close();
        readFileFromInput.close();
    }
    
}
