import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    /**
     *  run time error ..  error: Class names, 'EmailValidation', are only accepted if annotation processing is explicitly requested
     *  u can learn it will take 1 or 3 years not a problem after u will on 30 years on industry that is the ur power
     *  i dont know about annotations so when i will learn annotations on that day i will make sure correct my old errors 
     *  1 error
     *  be motivate be learn everyday above 12 hr to spend learning only u can achive anything  that enough bye 
     *  i have lot of errors in java pratice sessions but no one can helping okay thats fine yogi u can do anything 
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("(a-z|0-9)?[a-z0-9}*@[a-zA-Z]+[.][c][o][m]");
        System.out.println("Enter valid your email id");
        String email = sc.nextLine();
        Matcher m = p.matcher(email);
        sc.close();
        if(m.find()&&m.group().equalsIgnoreCase(email)){
            System.out.println("It is the Valid EMAIL id"+m.group());
        }
        else{
            System.out.println("It is not valid EMAIL ID"+m.group());
        }
    }
}
