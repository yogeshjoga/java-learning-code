import java.util.Scanner;

public class AdvanceLoops {
    /**
     * for loop some few logics
     * 
     */

     // get odd number without using another variable

    int i =0;
    public int loopFors() { 
        for(  i=2;   i<=10;  i=((i%2==0)?i:i++)   ){

            System.out.println(i);
            i++;
        }
        return i; 
    }


    public int loop2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("one odd 1\n two even 2");
        int num = sc.nextInt();
        int inpt = ((num == 1)?1:2);
        System.out.println("your numbers");
        for(i=inpt; i<=10; i+=2){
            System.out.println(i);
        }
        return 0;
        
    }
    
    public static void main(String[] args) {
        AdvanceLoops obj = new AdvanceLoops();
        obj.loopFors();
       
       // obj.loop2();
    }
}
