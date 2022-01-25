import java.util.Scanner;
// star patterns by using construtors
public class ConstPattern {
    int row;
    ConstPattern(int rowCol ){
        this.row = rowCol;
        System.out.println("Ready to start the printing start patterns \n it is only right angle triangle pattern only!!!!!");
        for(int i=0; i<=this.row; i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void inputRow(){
        System.out.println("-----------------------------");
        System.out.println("Enter 1st number it is taken to row and col length");
    }
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int num1 = num.nextInt();
    ConstPattern yo = new ConstPattern(num1);
    yo.inputRow();
    num.close();
    }
}
