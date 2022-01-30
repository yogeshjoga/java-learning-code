import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    int howManyNum;
    int rangeNum;
    void inputs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many Random numbers You want ? Enter the number ");
        this.howManyNum = sc.nextInt();
        System.out.println("How Range You want ? Enter the Range of the number ");
        this.rangeNum = sc.nextInt();
        sc.close();
    }
    void ranNum(){
       Random num = new Random();
       int num1;
       System.out.println("\n-------Just see the your Random number will display from below enjoy the day----------- ");
       System.out.println("\n------------------------------ HAPPY CODING ------------------------------------------- ");
       for(int i=0;i<=this.howManyNum-1;i++){
          num1 = 1+num.nextInt(this.howManyNum);
           System.out.println(num1+"");
        }
    }  
    public static void main(String[] args) {
        RandomNumbers obj = new RandomNumbers();
        obj.inputs();
        obj.ranNum();
    }
    
}
