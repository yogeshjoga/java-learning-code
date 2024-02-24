package BitManupulaiton;

public class ForLoops {

    public static void main(String[] args) {

        // printing number 1 to 100
        // using for loop

        int i;
        for( i =1; i<=100; i++){
            System.out.println("i");
        }

        int hello =0;
        while(hello < 100){
         System.out.println("hello ----");
            hello++; // start = start + 1;
        }



        int start =0;
        while(true){
            System.out.println("printing from ture");
            if(start == 100){
                break;  // loop termination
            }
           start++;
        }



        // basic pattern printing
        // print
        // println

        for( int m=0; m<5; m++){
           System.out.println("* ");
            System.out.print("* ");
        }

        // printing 5 * 5 matrix
        int row = 5;
        int cols = 5;
        for(int y=0; y < row; y++){
            for(int z=0; z < cols; z++){
               System.out.print("* ");
            }
            System.out.println();
        }


        // right angle triangle
        int spaces = 4;
        int star = 1;
        int rows = 5; // rows
        for(int l = 0; l<rows; l++){
            // spaces
            for(int z = spaces; z > 0; z--){
                System.out.print(" ");
            }

            // stars
            for(int x = 0; x < star; x++){
                System.out.print("*");
            }
            spaces --;
            star++;
            System.out.println();
        }
    }
}
