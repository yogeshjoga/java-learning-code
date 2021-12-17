public class Question1 {
    static double factroial(int d){ // method
        double b=1;
        for(int a=1; a<=d;a++){ // loop for incresing the value and multiply with them
        b=b*a;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(factroial(99));
    }
    
}
