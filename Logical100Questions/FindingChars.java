import java.util.Scanner;
public class FindingChars {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner values = new Scanner(System.in);
        System.out.println("Enter a name");
        char [] enterName = name.next().toCharArray();
        char finding = values.next().charAt(0);
        int count=0;
        for(int i=0;i<=100;i++){
            if(finding == enterName[i]){
                count++;
            }
        }
        System.out.println(count);
        name.close();
        values.close();
    }
    
}