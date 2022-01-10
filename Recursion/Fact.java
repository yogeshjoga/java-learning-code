import java.util.Scanner;
public class Fact {
    static int fact(int num){
        if(num==0){ return 1;}
        else{return (num*fact(num-1));}   // it is the again again frames created 
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find the fact by using the recursion....");
        Scanner numB =new Scanner(System.in);
        int num1 = numB.nextInt();
        long factNUm = fact(num1);
        System.out.println(num1+" : factroial is : "+factNUm);
        numB.close();
    }
    
}