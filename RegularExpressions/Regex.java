import java.util.regex.*;
public class Regex {
    /* This is the regular expression  1st program 
       regex meaning regular expression 
       today my learning
        keywords is 
             regex class import
             start(),end(), group() methods in pattern class
             find() matcher() compile() in Pattern class methods
    */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("aabbccsssdddgg");
        while(m.find()){
            System.out.println(m.start()+"\t"+m.group());
        }

    }
    
}
