import java.util.Random;
import java.util.Scanner;
/*
 How to create the array tabel  with index numbers and values to display the console
 this the question so, i can try it 

 this is the worng code  i will make another one below 


public class ArrayTable {
    int num22;
    Random num = new Random();
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[num22];


    void ranDomNum(){
        int hello;
        this.num = this.sc.nextInt();
        for(int i=0; i<=10;i++){
           hello = this.num.nextInt(6);
        }
    }
    void table(){
        for(int i=0; i<arr.length;i++){
            System.out.println(i+"\t\t"+arr[i]);
        }
    }
    public static void main(String[] args) {
        ArrayTable obj = new ArrayTable();
        obj.ranDomNum();
        obj.table();
    }

    
}
 */



public class ArrayTable{
     int inNum;
     void inPuts(){
         Scanner sc = new Scanner(System.in);
         Random ranNum = new Random();
         System.out.println("Enter the Table size in rows, in index numbers");
         int num1 = sc.nextInt();
         System.out.println("Enter the range ");
         int num2 = sc.nextInt();
         for(int i=0; i <=num1;i++){
                this.inNum = 1+ranNum.nextInt(num2);
               // int arr[] = new int[this.inNum];
               // only one number will store in the inNum variable so we can store the array values in the given the range.
         }

         sc.close();
    }
    void arrayTab(){
        int arr[] = new int[this.inNum];
         for(int i=0; i<=arr.length; i++){
             System.out.println(i+"\t\t\t"+arr.length);
         }

    }
    public static void main(String[] args) {
        ArrayTable obj = new ArrayTable();
        obj.inPuts();
        obj.arrayTab();
    }
 }


