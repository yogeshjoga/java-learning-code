import java.util.Scanner;
public class SumOfNumGivenRange {
    public static void main(String[] args) {
        int sum=0;
        System.out.println(" Enter the range of sum of number...");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
            if(num1>num2){
                System.out.println("\n"+num1+" : It is bigger then range limit value is : "+num2+"\n Please enter new values \n");
                 }
            for(int i=num1; i<=num2;i++){
                 sum=sum+i;
                }
        System.out.println(num1+" : inital value \n " +num2+" : range value \n " + sum +" : it is the total sum of range value");
        num.close();
    }
    
}
