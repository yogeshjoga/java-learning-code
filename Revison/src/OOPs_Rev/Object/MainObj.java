package OOPs_Rev.Object;

import com.sun.tools.javac.Main;

/**
 * <b>This is the objects and keywords used in java objects
 * <br> this and this() method and super and super() method</b>
 * <P>These are very importnent in java language so must know about the class and object with keywords</P>
 *
 *
 * @author <b>Yogesh Joga</b>
 */
public class MainObj extends  SuperClass{

    int a;
    long totalSum;



    // super class variables and methods

    public void mySuperKeyword(){
        // super keyword can invoke the super class methods and variables
        // It's invoke only non-static references in non-static context

        // variable
        super.addNum = 20;
        // method calling
        super.hello();
    }










    /**
     * <b>Here without creating the object, we can call the non_static references <br>
     * we are calling only non-static variables/fields</b>
     * @param num1
     * @param num2
     * @return long
     */
    public long add (int num1, int num2){
        this.a = num1;
        this.totalSum = num1+ num2;
        return this.totalSum;
    }

    /**
     * <b>Let's calling the Non-static methods in Non-static context</b>
     * @param num1
     * @param num2
     * @return
     */
    public int sub(int num1, int num2){
      this.totalSum =  this.add(num1, num2);
      // casting the type --> long to int down-casting
        return (int)this.totalSum;
    }



    /**
     * <p>
     *     <ol>
     *     <b>In object level we are using two Keywords there are : </b>
     *         <li>This --> keyword</li>
     *         <li>Super --> Keyword</li>
     *         <li>this() --> method</li>
     *         <li>super() --> method</li>
     *     </ol>
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        // this is called object
        MainObj mainObj = new MainObj();

    }
}
