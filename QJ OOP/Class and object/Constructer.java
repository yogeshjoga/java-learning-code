import java.util.Scanner;
/* Types of constructors:
    1 Default constructor:
        constructor added by the compiler when the developer forget to add.
    2 Non-parameterized or NO-argument constructor:
        Constructor without the formal arguments added by te deverloper.
    3 Parameterized constructor:
        Constructor with formal arguments are known as parameterized construcotrs and they are
        mainly used to intinalize the non-static properties during the object creation.

 */
public class Constructer {
    //calculator
    int num1,num2;
    public Constructer(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("The total value of the "+this.num1+" and "+this.num2);
        int add = this.num1 + this.num2;
        System.out.println(add+" add the two numbers");
    }
    void billa(){
        System.out.println("welcome darling");
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        Constructer yogi = new Constructer(num1,num2);
        yogi.billa();
        num.close();

    }

}
