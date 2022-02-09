import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static void main(String[] args) {
        Pattern p  = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(args[0]);
        if(m.find()&&m.group().equals(args[0])){
            System.out.println("\nValid mobile number : "+m.group()+"\n");
        }
        else{
            System.out.println("\nThis is not Valid mobile numbe : "+m.group()+"\n1) check the intial code \n2) your enterd the worng number like lessthen 10digits r more then 10digit\n");
        }
    }
}
