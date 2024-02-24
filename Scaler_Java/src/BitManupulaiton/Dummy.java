package BitManupulaiton;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dummy {

    public static void main(String[] args) {

//        System.out.println("--------hello--------");
//        // Scanner sc = new Scanner(System.in); // object
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your name");
//        String myName = sc.next();
//        System.out.println("my Name is : " + myName);
//
//
//        int a = 1;
//
//
//        byte b = 127;   // upto -128 to + 127
//        short sh = 24343;
//        int  in = 234738748;
//        long loo = 287388912342348L;
//        float fl = 12381298378.8979889F;
//        double doub = 239823988923.893897238974893892;
//
//        char cc = 'j';  // allow only single chars
//        boolean bbb = true; // true or false
//
//        String str = "C:\\Program Files\\Java\\jdk-19\\bin\\java.exe\" \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2023.1\\lib\\idea_rt.jar=60874:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2023.1\\bin\" -Dfile.encoding=UTF-8 -Dsun.stdout.e";
//
//       int left = 100;
//       int right = 500;
//
//       if(left < right){
//           System.out.println("hello i am here printed");
//       }else{
//           System.out.println("happy to use our ser");
//       }
//       left--; // post decrement
//       --left;  // pre decrement
//       left++; // post increment
//       ++left;  // pre increment
//
//       // hared coded values
//        if(5 < 1){  // true when?
//            System.out.print("wow i am printed");
//        }
//
//        // 500
//        // withdraw - 400
//        // bla - 400
//        // 100
//        // mi account lo money thakkuva unndi
//
//
//        System.out.println("    *");
//        System.out.println("   **");
//        System.out.println("  ***");
//        System.out.println(" ****");
//        System.out.println("*****");
//
//       String num = (5 < 1) ? "hello" : "hii"; // num hii
//
//       if(5 < 1){
//           System.out.println("hello");
//       }else{
//           System.out.println("hiii.............");
//       }
//
//        System.out.println(num +" From ternary cond");
//
//       int studentMarks = 20;
//        if( 1 < 100){
//            System.out.println("pass");
//        }else if(20 < 100){
//            System.out.println("fail");
//        }else if(30 < 100){
//            System.out.println("1st calss");
//        }else{
//            System.out.println("fail");
//        }

        // 90 above 1st class
        // 60 to 90 2nd class
        // 50 to 60 pass
        // 50 below fail



        int yyyy =5;
        for(int i=1; i<= yyyy; yyyy++){
            // spaces
            for(int sp=1; sp <= yyyy-i; sp++){
                System.out.print(" ");
            }
            for(int st=1; st<=i; st++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
