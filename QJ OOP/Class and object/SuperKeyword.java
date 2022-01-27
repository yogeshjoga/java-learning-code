import java.util.Scanner;

public class SuperKeyword {
    int a,b,c;
    SuperKeyword(int a, int b){
        int c=0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.c = this.a + this.b;
        System.out.println(this.c+" This is the Super class constructor : ");
    }
    void Substraction(int a , int b){
        int c=0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.c = this.a - this.b;
        System.out.println(this.c+" This is the Super Class Substraction method");
    }
}
public class Billa extends SuperKeyword{
        Billa(int a, int b){
            int c = 0;
            super.a = a;
            super.b = b;
            super.c = c;
            super.c = super.a%super.b;

        }

}
 class UserLogic{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        SuperKeyword yogi = new Billa(num1,num2);
        num.close();
    }
}
