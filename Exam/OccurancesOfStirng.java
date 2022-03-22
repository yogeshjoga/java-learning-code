import java.util.Scanner;

/**
 * JOGA YOGESH
 * PHONE 9110566354
 * EMAIL: JOGAYOGESHEDU@GMAIL.COM
 */
public class OccurancesOfStirng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inPut = sc.next();
        sc.close();
        for(char ch ='a';ch<='z';ch++){
            int temp=0,rev=0;
            for(int i = 0; i<=inPut.length()-1;i++){
                if(ch==inPut.charAt(i)){
                    temp++;
                    if(temp>=rev){
                        rev=temp;
                    }
                }
            }
            if(temp>0)
            System.out.println(ch+" occarance "+rev);
        }
    }
}
