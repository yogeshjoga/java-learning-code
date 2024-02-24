package Java_Variables_DataTypes;

import java.util.Scanner;

public class InputOutput {

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(4,5);

        // if we want to take input from console
        // we need to use Scanner class Object

        Scanner sc = new Scanner(System.in);

        int firstNUm = sc.nextInt();
        int secNum = sc.nextInt();

        add(firstNUm, secNum);

    }
}
