package debuging;

/***
 *
 *   -Why recusion
 *   - Recursion:Function calling itself
 *   - Its helps us in solving bigger/complex problems in a simple way.
 *   - You can convert recursion solutions into itrations and vise versa
 *   - Directly solved loops its quite complex, 1st solve Recursion and convert itration
 *   - Recursion takes Space complxity is not constent
 *   - It helps us breakdown into bigger problems into smaller problems
 *
 *   - Recursion Tree (mentain)
 *
 */
public class ResursionNumber {


    public static void main(String[] args) {
        print(1);
    }

    /***
     * Base condition in recursion
     * it is a condition where the recursion stop making recursion
     * it is a simple if condition,
     *
     *  - Each call treated as a new function call in stack
     *  - every call is a function its stored in stack
     *  - every call takes separate memory
     *  - memory of computer will exceed the limit StackOverFlow error
     * @param x
     */
    public static  void print(int x){

        /**
         * Base condition
         */
        if(x ==5){
            System.out.println(5);
            return;
        }
        System.out.println(x);
        print(x+1);
    }

}
