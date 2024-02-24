package debuging;

public class Message {


    public static void main(String[] args) {

        message1();
    }

    /**
     * Recursion
     *  call stack
     *  methods flow
     *  code flow
     */
    public  static void message1(){
        System.out.println("M1");
        message2();
    }
    public  static void message2(){
        System.out.println("M1");
        message3();
    }
    public  static void message3(){
        System.out.println("M1");
        message4();
    }
    public  static void message4(){
        System.out.println("M1");
        message5();
    }
    public  static void message5(){
        System.out.println("M1");
    }
}
