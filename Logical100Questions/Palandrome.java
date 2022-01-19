import java.util.Scanner;
// 13 logical code is the palandrome
public class Palandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse=0,num2=num,num1;
        while(num !=0){
            num1=num%10;
            reverse=reverse*10+num1;
            num=num/10;
        }
        if (num2 == reverse){System.out.println(num2+"  it is a palindrome number  "+reverse);}
        else System.out.println("it is not a palidrome number"+reverse);
        sc.close();
    }
    
}
