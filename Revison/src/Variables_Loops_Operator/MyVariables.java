package Variables_Loops_Operator;

/**
 *
 *
 * @see Integer
 * @author <b>Yogesh Joga</b>
 */
public class MyVariables {

    /**
     *
     *
     * <b>Global Variables types</b>
     * <p>
     *     <b>What is Global Variable's? <br>
     *     Ans: A Global Variable In-side the class and outside the methods it is called Global Variables. Stored in Heap memory</b>
     *     <ol>
     *         <p><b>Primitive Global Variables</b></p>
     *
     *         <li>default Primitive Global Variables</li>
     *         <li>public Primitive Global Variables</li>
     *         <li>static Primitive Global Variables</li>
     *         <li>public final Primitive Global Variables</li>
     *         <li>Private primitive Global Variables</li>
     *
     *         <p><b>Non-Primitive or Reference Global Variables</b></p>
     *
     *         <li>default Primitive Global Variables</li>
     *         <li>public Primitive Global Variables</li>
     *         <li>static Primitive Global Variables</li>
     *         <li>public final Primitive Global Variables</li>
     *         <li>Private primitive Global Variables</li>
     *     </ol>
     * </p>
     * <br>
     * <b>Local Variables Types</b>
     * <p>
     *     <b>What is Local Variables? <br>
     *     Ans: A Local Variables are inside the methods, condition or Loops is called Local Variables, Stored in Stack memory </b>
     *     <ol>
     *         <p><b>Primitive Local Variables</b></p>
     *
     *         <li>default Primitive Local Variables</li>
     *         <li>public Primitive Local Variables</li>
     *         <li>static Primitive Local Variables</li>
     *         <li>public final Primitive Local Variables</li>
     *         <li>Private primitive Local Variables</li>
     *
     *         <p><b>Non-Primitive or Reference Local Variables</b></p>
     *
     *         <li>default Primitive Local Variables</li>
     *         <li>public Primitive Local Variables</li>
     *         <li>static Primitive Local Variables</li>
     *         <li>public final Primitive Local Variables</li>
     *         <li>Private primitive Local Variables</li>
     *     </ol>
     * </p>
     */
    int addNum = 100;


    // variable declaration
    int addNum2;


    public static int subNum;

    // variable initialization if we're pointing to value
    public static int subNum2 = 100;

    public final  int sub =500;
    public final int add = 200;

    // private variables
     private int addNums1;

     private int subNums2;

     String myNameis= "yogesh joga";


     public static void localVariables( int heee){
         // variable declaration and initialization
         int a =100;

         // variable declaration
         int b;

         int c =100;

         // int i is the for loop local variable
         // its scope is only for loop implementation only
         for(int i=0; i<=10; i++){
             System.out.println("Hello Yogesh Joga");
         }

     }


    /**
     *
     * <b>Loops in Java and Type of Loop's</b>
     * <p>
     *     <ol>
     *         <li>for Loop</li>
     *         <li>Enhanced For loop</li>
     *         <li>forEach method from java 8v</li>
     *         <li>While loop</li>
     *         <li>do-While</li>
     *     </ol>
     * </p>
     */

    public static void loopsInJava(){

     }

    /**
     * <b>Flow Control Statements</b>
     *
     * <p>
     *     <ol>
     *         <li>if condition</li>
     *         <li>else block</li>
     *         <li>else if condition</li>
     *         <li>Switch statement</li>
     *         <li>switch yield operator java 14</li>
     *         <li>break keyword</li>
     *         <li>Continue keyword</li>
     *     </ol>
     * </p>
     *
     */

    public static void flowControls(){
        int a =10;
        // Decision-making if, else-if and else
        if(a == 10){
            System.out.println("a is : correct ans");
        }else if(a >= 10){
            System.out.println(" a is more higher ans");
        }else{
            System.out.println(" a is too small ans");
        }

        // switch control
        int b = 20;
        switch(b){
            case 20:{
                System.out.println("Correct ans");
            }
            case 30:{
                System.out.println("not correct ans");
            }// soon, it's going the cases
        }


        // Break and continue keywords
        for(int i=0; i<=10; i++){

            // break keyword
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        // continue jumping statement
        for(int i=0; i<10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i+"this from");
        }
     }

    /**
     * <p><b>In java we have some types of operators</b></p>
     * <p>
     *     <ol>
     *         <li>Mathematical/Arithmetic operators</li>
     *         <ol>
     *             <li>+ --> Addition x+y</li>
     *             <li>-  --> subtracts x-y</li>
     *             <li>* --> multiplication x*y</li>
     *             <li>/ --> Division x/y</li>
     *             <li> %  --> modulus x%y</li>
     *             <li>++ --> increment x++</li>
     *             <li>--   --> decrement x--</li>
     *         </ol>
     *
     *         <li>Assignment operators</li>
     *         <ol>
     *             <li><b>= --> x=5</b></li>
     *             <li><b>+= --> x+=5</b></li>
     *             <li><b>-= --> x-=5</b></li>
     *             <li><b>*= --> x*=5</b></li>
     *             <li><b>/= --> x/=5</b></li>
     *             <li><b>%= --> x%=5</b></li>
     *             <li><b>&= --> x&=5</b></li>
     *             <li><b>|= --> x|=5</b></li>
     *             <li><b>^= --> x^=5</b></li>
     *             <li><b> >>= --> x>>=5</b></li>
     *             <li><b> <<= --> x<<=5 </b></li>
     *
     *         </ol>
     *         <li>Comparison operators</li>
     *         <li>Logical operators</li>
     *         <li>Bitwise operators</li>
     *
     *     </ol>
     * </p>
     *
     */
    public static void opertorsInJava(){


     }


    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        flowControls();


    }
}
