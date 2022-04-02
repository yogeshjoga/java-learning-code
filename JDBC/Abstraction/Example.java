import java.util.Scanner;

public class Example{
    private double firstNum;
    private double secondNum;

    public double getFirstNum() {
        return this.firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
       
    }
    
    public void setFirstNum(double firstNum,double secondNum) {
        this.firstNum = firstNum;
        if ( 0 >= secondNum) {
            this.firstNum = this.firstNum + secondNum;
        }
        System.out.println(this.firstNum);
    }

    public double getSecondNum() {
        return this.secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

   public static void main(String[] args) {
       Example ex = new Example();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       double firstNum = sc.nextDouble();
       System.out.println("Enter second number");
       double secondNum = sc.nextDouble();
       ex.setFirstNum(firstNum);
       ex.setSecondNum(secondNum);
     //  ex.getFirstNum()=ex.getFirstNum()+ex.gerSecondNum();
       System.out.println("this is the withdrawer amount");
       System.out.println(ex.getFirstNum()-ex.getSecondNum());
       System.out.println("This is the deposited amount");
       ex.setFirstNum(firstNum, secondNum);
       sc.close();

   }

}