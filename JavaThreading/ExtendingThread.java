public class ExtendingThread extends Thread{
    /**
     * 
     */
    public void childThreadExample(){
        for(int i=0; i<=100; i++){
            System.out.println("This is the child Thread");
        }

    }

}