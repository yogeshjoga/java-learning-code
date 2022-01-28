import java.util.Scanner;

public class classNameA {
    int cc = 200;
    int bb = 300;
    void sowmya(int a, int b){
        int c= a+b;
        System.out.println("\n\n\n"+c+" addition of the two numbers\n\n");
    }
    void yogi(){
        int c = this.cc + this.bb;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classNameA sow1 = new classNameA();
        System.out.println("enter 2 number to do a addition");
        int num1 =sc.nextInt(),num2 = sc.nextInt();
        sow1.sowmya(num1, num2);
        sc.close(); // public default private pro
    }
}
