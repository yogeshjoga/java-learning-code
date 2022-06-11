import java.util.Scanner;

public class Vowels {
    /**
     * we can create this programm number of way 
     * this is method to pass a value
     */
     public static void isVowel(char ch) {
         char ch1 = Character.toUpperCase(ch);
         if(ch1 =='A'|| ch1 == 'E'||ch1 == 'I'||ch1 == 'O'||ch1 == 'U'){
             System.out.println(ch+ " it is an vowel");
         }
         else{
             System.out.println(ch+ " it is a consonent");
         } 
     }
     public static void main(String[] args) {
         Vowels obj = new Vowels();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a char to check the is vowel or consonent");
         char ch = sc.next().charAt(0);
         obj.isVowel(ch);
     }
}
