package BitManupulaiton;

import java.util.Scanner;

public class StudentMarkSheet {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("1st class");
        }else if(marks >= 60){
            System.out.println("2nd class");
        }else if( marks >= 50){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


        String str = (marks >= 90) ? "1st class" : "He is not a 1st class student";  // use this 
        System.out.println(str);  // don't use while printing variables
    }
}
