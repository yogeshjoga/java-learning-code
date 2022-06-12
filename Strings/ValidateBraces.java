import java.util.Scanner;

public class ValidateBraces {

    public void validate(String s) { 
     final String [] valid ={"()","[]","{}","()[]","{}[]","[]()","{}()","(){}","[](){}","(){}[]"};
        int i;
        int count = 0;
        for(i=0; i<=valid.length-1; i++){
            if(valid[i].equals(s) ){
                System.out.println("valid :" +s);
                count++;
            }
        } 
        if(count == 0){
            System.out.println("not valid : "+s);
        }
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the braces");
        String s = sc.next();
        ValidateBraces obj = new ValidateBraces();
        obj.validate(s);
    }
}