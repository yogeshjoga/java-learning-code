import java.util.Scanner;

public class ThisMethod {
    
    ThisMethod(int a, int b){
        int c;
        c= a+b;
        System.out.println(c+" This is the ThisMehod");
    }
    void yogi(int aa , int bb){
       this(aa,bb);
        System.out.println("This is the This Constructor Calling method");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        ThisMethod add = new ThisMethod(num1,num2);
        add.yogi(num1, num2);
        sc.close();
    }
}
