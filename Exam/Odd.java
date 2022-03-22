import java.util.Scanner;

/**
 * JOGA YOGESH
 * PHONE 9110566354
 * EMAIL: JOGAYOGESHEDU@GMAIL.COM
 */
public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inPut = sc.nextInt();
        int a,sum=0;
         while(inPut != 0){
             a = inPut % 10;
             if(inPut % 2 != 0){
                 sum = sum + a;
                 
             }
             inPut = inPut/10;
        }
        System.out.println(sum);
    }
    
}

