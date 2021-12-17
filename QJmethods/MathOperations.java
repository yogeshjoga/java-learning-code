public class MathOperations {
    static int addition(int a, int b){
        return a+b;
    }
    
    static int substraction(int a, int b){
        return a-b;
    }

    static int division(int a, int b){
        return a%b;
    }

    static int multi(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("\n    " + addition(12 , 10) + "  this is the addition");
        System.out.println("\n    " + substraction(12, 10) + "  this is the sub");
        System.out.println("\n    " + division(12 , 10) + "  this is the division");
        System.out.println("\n    " + multi(12, 10) + "  this is the multi \n");

    }
}
