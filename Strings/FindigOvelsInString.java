import java.util.Scanner;

public class FindigOvelsInString {

    public static void findOvel(String s) {
        String s1 = s.toUpperCase();
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        findOvel(s);
    }
    
}
