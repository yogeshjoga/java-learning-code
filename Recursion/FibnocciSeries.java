import java.util.Scanner;
public class FibnocciSeries {
    // Question of RECURSION  to write a program to calcuate the fibnocci series upto 100
    static int fab(int num1,int num2){
        int c;
        c=num1+num2;
        if(c<10000){
            System.out.println(c);
            return fab(num2 , c);
        }
        return c;
        
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        fab(num1, num2);
        num.close();
        
    }
    
}
