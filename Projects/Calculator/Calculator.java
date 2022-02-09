import java.util.Scanner;
public class Calculator {
    static int addition(int a, int b){
        int c = a+b;
        System.out.println ("\n"+c+ " :  additon of two numbes \n ");
        return c;
    }
    static int substration(int a, int b){
       int c = a-b;
       System.out.println (c + " : substraction of two numbers \n");
       return c;
    }
    static int mult(int a, int b){
       int c = a*b;
       System.out.println (c+ " : mutli of two numbers \n ");
       return c;
    }
    static int division(int a, int b){
       int c = a/b;
       System.out.println (c+ " : divison of two numbers \n ");
       return c;
    }
    static int Square(int a){
       int c = a*a;
      System.out.println (c+ " : divison of two numbers \n ");
      return c;
   }
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in), oparator = new Scanner(System.in),b1 = new Scanner(System.in);
        System.out.println("\n    Calculator app is ready to use ...... \n");
        int stNum = a1.nextInt();
        char opRand = oparator.next().charAt(0);
        int ndNum = b1.nextInt();
        int a=stNum,b=ndNum;

        if(opRand=='+'){
           addition(a, b);
        }
        else if(opRand=='-'){
           substration(a, b);
        }
        else if(opRand=='*'){
           mult(a, b);
        }
        else if(opRand=='/'){
           division(a, b);
        }
        // square is not working 
        else if (opRand=='^'){
           Square(a);
        }

     /*   addition(a, b);
        substration(a, b);
        mult(a, b);
        division(a, b);
     */
        
    }
}
