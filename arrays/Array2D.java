//2d arrays to use 

public class Array2D {
        static int[][] array2D = {{2,3},{3,89},{6,4},{17,46},{12,32}};
        static int[] array1D ={1,2,3,4,5,};
        static int[][][] array3D ={{1,2,3},{11,23,33},{55,34,23},{76,84,93},{03,23,64}};
        static void matrix(){
            System.out.println();
            System.out.println("=============2D Array=============");
            System.out.println();
            System.out.println("1st row and 1st col : "+array2D[0][0]);
            System.out.println("1st row and 2nd col : "+array2D[0][1]);
            System.out.println("2nd row and 1st col : "+array2D[1][0]);
            System.out.println("2nd row and 2nd col : "+array2D[1][1]);
            System.out.println("3rd row and 1st col : "+array2D[2][0]);
            System.out.println("3rd row and 2nd col : "+array2D[2][1]);
            System.out.println("4th row and 1st col : "+array2D[3][0]);
            System.out.println("4th row and 2nd col : "+array2D[3][1]);
            System.out.println("5th row and 1st col : "+array2D[4][0]);
            System.out.println("5th row and 2nd col : "+array2D[4][1]);
            System.out.println();
            System.out.println("=================ThankYou============");
            System.out.println();
            
        }

        public static void main (String[] args){
            matrix();


        }
}




