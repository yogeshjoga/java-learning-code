import java.util.Scanner;
import java.lang.Exception;
public class StringRev {

    static Scanner sc = new Scanner(System.in);

    static void stringRevers() throws Exception{
           //   String s = "yogiDarling";
             String s1 ="";
              System.out.println("\n Enter a String name to revers ");
                String s = StringRev.sc.nextLine();
                
              for(int i=0;i<s.length();i++){
                  s1 = s.charAt(i)+s1;
              }
        System.out.println(s+" it is reversed to the  "+s1);
        // for palandrome String to find 
        if(s.equals(s1)){
            System.out.println(s+" it is the paldrome string "+s1);
        }
            else{
                System.out.println(s+" it is not a paldrome string "+s1);
                
        }
    }

    // this is to finding the vowels in the string from taken to the end user to find the vowels
    static void stringFindingVowels() throws Exception{
        System.out.println(" Enter the String to find the vowels ");
        String s = StringRev.sc.nextLine();
       // sc.close();
        int count = 0;
        for(int i=0; i<s.length();i++){
            switch(s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                count++;
            }
        }
        System.out.println(count);
    }
    /**
     * now we can use the indexOf method to find the chars
     * @param args
     * @throws Exception
     * 1st take input string from end user r user
     * 2nd take a input from end user to find the char's in  string
     * question is the 
     * write a programming to finding indexOf method values fo a given char in all its
     * occeraneces fo a given string
     */
    public void indexOfFunction() throws Exception{
        System.out.println("Enter the string ");
        String s = StringRev.sc.nextLine();

        for(int i=0; i<s.length();i++){

        }
    }

    // user logic of the main method
    public static void main(String[] args) throws Exception {
        stringRevers();
        stringFindingVowels();
    }
    

}
