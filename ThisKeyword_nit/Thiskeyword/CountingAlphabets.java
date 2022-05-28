import java.util.Scanner;

public class CountingAlphabets {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        int[] chrArr = new int[name.length()];
        sc.close();
        char String[] = name.toCharArray();





        for(int i=0; i<=name.length();i++){
            chrArr[i]=1;
            for(int j=i+1; j<name.length();j++){
                if(String[i] == String[j]){
                    chrArr[i]++;
                    String[j] ='0';
                }
            }
        }

    }

} 
