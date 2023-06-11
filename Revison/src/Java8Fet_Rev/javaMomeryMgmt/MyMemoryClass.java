package Java8Fet_Rev.javaMomeryMgmt;


import Collections.ArrayList001;
import Java8Fet_Rev.forEachMethod.ForEachMethod;

public class MyMemoryClass {
    // Global variables
    int a = 10;
    int b = 20;

    // non-static method
    public  void add(int a, int b){
        int sum = a+b;
    }
    public static void main(String[] args) {

        // String literals
        String myName = "yogesh joga";

        String newName = "yogesh joga";

        String mySis = "teju";

        // String object
        String st = new String("yogesh joga");

        // object creating

        MyMemoryClass myMemoryClass = new MyMemoryClass();

        // local variables
        int hy = 100;
        int hyy = 200;

        // calling instance method by using object reference
        myMemoryClass.add(hy, hyy);



        //import the classes
     //   ForEachMethod fr = new ForEachMethod();
        ForEachMethod.readCollection();
        ArrayList001 ar = new ArrayList001();


    }
}
