import java.lang.*;
public class NullFying {
    void exampleNull(){
        System.out.println("it is the example of the Nullfying in method one 1");

    }
    void exampl2Nully(){
        System.out.println("\n\nit is the example of the Nullfying in method two 2 ");
    }
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        NullFying n = new NullFying();
        NullFying n1 = new NullFying();
        n.exampl2Nully();
        n.exampleNull();
        n1.exampl2Nully();
        n1.exampleNull();
        /**
         * now we will see the  freeMemory() and totalMemory() by using Runtime Class
         * 
         * there are two GARBAGE COLLECTORS in java lib 
         * 
         * first we will  create a runtime object 
         */
        System.out.println("\nTotal memory in the heap memory : "+r.totalMemory());
        System.out.println("Free memory in heap memory to call to JVM : "+r.freeMemory());
       // r.gc();
       n=null;
       n1=null;// this is called the nullfying the variable 
        System.out.println("Total memory after Garbage colletion "+r.totalMemory());

        /**
         * this is the out put like first i will put 
         * 
         *    n= null; was commentd
         *    n1= null; was commentd
         * 
         *  after i will nullfying 2 objects chack the second output
         * 
         * 
         * ------------------------------------------------
         * 1st output like be
         * 
        it is the example of the Nullfying in method two 2
        it is the example of the Nullfying in method one 1


        it is the example of the Nullfying in method two 2
        it is the example of the Nullfying in method one 1

        Total memory in the heap memory : 132120576
        Free memory in heap memory to call to JVM : 130587584
        Total memory after Garbage colletion 8388608

        -----------------------------------------------------------
        this is the second output

        it is the example of the Nullfying in method two 2
        it is the example of the Nullfying in method one 1


        it is the example of the Nullfying in method two 2
        it is the example of the Nullfying in method one 1

        Total memory in the heap memory : 132120576
        Free memory in heap memory to call to JVM : 130587584
        Total memory after Garbage colletion 132120576


         */
       
    }
    
}
