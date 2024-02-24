package recursion;

public class RecursiveNumbers {


    /**
     * Debug this class and understand again again Debug all these 3 classes for basic understand
     * @see Message
     * @see NumberPrinting
     * @param args
     */
    public static void main(String[] args) {
         // call the recursive method
        print(1);
    }

    /**
     * in before we played with function calling another function
     *  and printed required output
     *
     *    some observations
     *       same code/ same body/ same method signature
     *       calling multiple time and printed same output right
     *
     *       Can we call one function, again and again upto our requirement?
     *       Yes, It's possible
     */

     public static void print(int n){

         /**
          * when its ended ?
          * which is the last method call?
          * the last method call won't call any further method Right?
          * so that is the last method we need to stop calling method itself
          *   The method calling stops, condition is called Base Condition in Recursion
          */
         if(n == 6){
             return;
         }

         System.out.println(n);
         /**
          * why n + 1 ?
          * come back to NumberPrinting classs
          *   1st printed --1
          *   2nd printed  --2
          *   3rd printed --3
          *   soon on incremented by 1 right?
          *   so every function call we will add one more time
          */
         print(n+1);
     }
}
