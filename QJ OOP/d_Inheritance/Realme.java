import java.util.Scanner;
public class Realme extends Mobile {
    // This is the IS-A Relationship
    // This is the SUB-CLASS/CHILD CLASS
    String frontCam,rareCam;
    Realme obj = new Realme();
    public void inPuts(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RealMe Front Camera MegaPixels ");
        this.frontCam = sc.next();
        System.out.println("Enter your RealMe Rare Camera MeagPixels ");
        this.rareCam = sc.next();
        System.out.println("Your RealMe mobile Camera Specfications \nFront Camera is "+frontCam+"\nRare Camera is "+rareCam);
    }
    public void realmeCamera(){
        obj.camera();//if we can call the frontCam we can get null values why because instance variable is creating fresh object we are intilizing at now!!
        System.out.println("");
    }
    public void realmeBattery(){
            // how to invoke the objects !!!!
    }
    public void network(){
        // airtel, Jio , BSNL, Idea, vodafone etc...
    }
    public void realmeMobileSpecfications(){

    } 

}
