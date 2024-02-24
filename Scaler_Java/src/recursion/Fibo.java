package recursion;

public class Fibo {

    public static void main(String[] args) {

        int n = fibo(10);
        System.out.println(n);
    }

    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
