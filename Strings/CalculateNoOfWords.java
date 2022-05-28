import java.util.Scanner;

public class CalculateNoOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st line words");
        String inp = sc.nextLine();
        System.out.println("Enter the 2nd line words");
        String inp1 = sc.nextLine();
        System.out.println("how many lines you want");
        int lin = sc.nextInt();
        String con;
        for(int i=3; i<=lin; i++){
             con = inp+" "+inp1;
             inp = inp1;
             inp1 = con;
             System.out.println(inp1);
        }
        
    }
    
    
    
}
