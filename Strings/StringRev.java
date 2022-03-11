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
    public static void indexOfFunction() throws Exception{
        System.out.println(" Enter the string ");
        String s = StringRev.sc.nextLine();
        System.out.println(" Enter a char to find given string indexOf ");
        String s1 = StringRev.sc.next();
        int ind = 0;
        for(int i=0; i<s.length();i++){
            ind = s.indexOf(s1,i);
            System.out.println(ind);
        }
    }


    /**
     * 
     * @param args
     * @throws Exception
     * write a programming to remover the duplicate char's presented in the 
     * given string 
     *  1st quetion is using indexOf method to solve this 
     *  2nd question is without using indexOf method to slove this 
     * 
     */
    // by using indexOf method to remove the chars presented in string
    public static void remCharIndex(){
        System.out.println(" Enter a line of String to remove the duplicate chars ");
        String s = StringRev.sc.nextLine();
        String s1="";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(s1.indexOf(ch)<0){
                s1=s1+ch; // s1+=ch we can write this manner also
            }
        }
        System.out.println(s1);

    }
    /**
     * 
     * @param args
     * @throws Exception
     * with out using indexOf method to write a programming to remvoe the duplicate chars
     * in the string values
     * thats it
     */

    public static void arrayRemoveDupliacte(){

    }
    
    /**
     * 
     * @param args
     * @throws Exception
     *  write a programm to add all the digits preseted in the given mixed string
     *  in integer formate only?
     * 
     */
    public static void stringsToIntegers(){
        System.out.println(" Enter a string with number to add the all numric values from given string ");
        String s = StringRev.sc.nextLine();
        int add = 0;
        for(int i=0; i<s.length();i++){
            // we can use wapper classes 
            if(Character.isDigit(s.charAt(i))){
            add = add+Character.getNumericValue(s.charAt(i));
            }
          //  System.out.println(add);
        }
        System.out.println(s+" the string containing these numbers "+add);
    }





    // user logic of the main method
    public static void main(String[] args) throws Exception {
       // stringRevers();
       // stringFindingVowels();
      // indexOfFunction();
      // remCharIndex();
      stringsToIntegers();
    }
    

}
