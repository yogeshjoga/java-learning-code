public class MainThreadExample {
    public static void main(String[] args) {
        ExtendingThread t = new ExtendingThread();
        t.start(); 
        /**
         * 1st im created the new object from my child class object that is extends from thread class
         * t.start() mean it will start the excution by child thread it as no dependences
         * 
         * 
         */
        for(int i=0; 1<=100; i++){
            System.out.println("This is the main thread");
        }
    }
}
