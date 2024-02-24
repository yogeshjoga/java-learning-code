package debuging;

public class PatternsRecursion {

    public static void main(String[] args) {
       patter(5,0);

     //   sqPattern(5, 0, 0);
    }

    public static void patter(int rows, int cols){
         if(rows == 0){
             return;
         }
         if(rows > cols){
         //    System.out.print("* ");
             patter(rows, cols+1);
             System.out.print("* ");
         }else{
          //   System.out.println();
             patter(rows-1, 0);
             System.out.println();
         }
    }


    public static void sqPattern(int rows, int index , int limit){
        if(limit == rows){
            return;
        }
        if(index < rows){
            System.out.print("* ");
            sqPattern(rows, ++index, limit );
        }else if(index == rows){
            System.out.println();
            sqPattern(rows, 0, limit+1);
        }
    }

}
