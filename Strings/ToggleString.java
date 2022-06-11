import java.util.Scanner;

public class ToggleString {
        public static void toggerString(String s) {
            String s1="";
            System.out.println("Before toggle : " + s);


            for(int i=0; i<s.length(); i++){


                 if(Character.isUpperCase(s.charAt(i))){
                 s1 = s1+Character.toLowerCase(s.charAt(i));


                }
                else{
                    
                    s1 = s1 + Character.toUpperCase(s.charAt(i));
                }
            }
            System.out.println("After toggle string : "+s1);
        }

        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String s= sc.next();
            ToggleString.toggerString(s);
            

        }
    
}
