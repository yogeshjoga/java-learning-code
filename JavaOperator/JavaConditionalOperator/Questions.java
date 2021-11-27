//1st question : Write a program to print wheter the given number is even or odd 17.
//2nd question : Write a program to check the given number is divisable into 3 and if its then print good morining orther wise good night.
//3rd question : Write a program to chek the largest of given two numbers and print which is largest.
//4th question : Write a proagam to check the largest value of the 3 given values by using conditonal operator only.

class Questions{

    static int a=2;
    static int b=8;
    static int c=3;
    static int d=100;
    static String out1st;
    static String out2nd;
    static String out3rd;
    static String out4th;

    static void conditionalOperators(){
        //1st question
        System.out.println();
        out1st = (a%b==0)?"Even Number" : "Odd Number"; // Conditional operator statment 
        System.out.println("It is Even or Odd = " +out1st); // 1st answer is done
        System.out.println();

        //2nd question
        out2nd = (c%b==0)? "Good Morning":"Good Night";  // Conditional opertor statment
        System.out.println("It is divisable into 3 = " +out2nd); //2nd answer is done
        System.out.println();
        
        //3rd question
        out3rd = (a<d)? "D(100) is the bigger!" : "a is the Bigger!";
        System.out.println("Which is the Bigger value =  " +out3rd);
        System.out.println();

        //4th question
        int large = (a>b)? a: b;
        String bigger = (large<d)? d +" is larger": large+ " is larger";
        System.out.println(bigger);
        System.out.println();


        //4th answer is in 2nd type we will write
        int largerValue = (a>b)? ((a>d)? a:d): ((b>d)? b :d);
        System.out.println("the larger value is : "+largerValue);




    }

    public static void main(String[] yogi){
        conditionalOperators();
    }

}