package BitManupulaiton;

public class Patterns {
    public static void main(String[] args) {

        int rows =5;
        for(int i=1; i<= rows; i++){
            // spaces
            for(int sp=1; sp <= rows-i;  sp++){
                System.out.print(" ");
            }
            for(int st=1; st<=i; st++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
