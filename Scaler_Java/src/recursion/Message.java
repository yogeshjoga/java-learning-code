package recursion;

public class Message {

    public static void main(String[] args) {
        /**
         * don's use loops while for do while what ever it may be print 5 times hello world
         *  create function to print
         */


        /***
         *         System.out.println("hello world");
         *         System.out.println("hello world");
         *         System.out.println("hello world");
         *         System.out.println("hello world");
         *         System.out.println("hello world");
         *
         *         it won't allow
         */


        /***
         *         printMessage();
         *         printMessage();
         *         printMessage();
         *         printMessage();
         *         printMessage();
         *
         *         this is also not allow the function calling n times its not good write
         */

        /**
         * lets call HelloMessage class method
         *  printMessage1()
         */

        // debug below function and understand the flow
        HelloMessage.printMessage1();


    }


    public static void printMessage(){
        System.out.println("hello world");
    }


    /**
     * lets implement new class and relatives methods
     */


   static class HelloMessage{


        public static void printMessage1(){
            System.out.println("hello world");
            printMessage2();
        }

        public static void printMessage2(){
            System.out.println("hello world");
            printMessage3();
        }

        public static void printMessage3(){
            System.out.println("hello world");
            printMessage4();
        }

        public static void printMessage4(){
            System.out.println("hello world");
            printMessage5();
        }

        public static void printMessage5(){
            System.out.println("hello world");
        }
    }
}
