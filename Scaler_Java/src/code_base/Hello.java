package code_base;

public class Hello {

    public static void main(String[] args) {
        int[] arr = {5,5,5};
        int i =0;
        arr[i] = i++;
        System.out.print(arr[0] +" "+arr[1] +" "+ arr[2] +" "+ i);
    }
}
