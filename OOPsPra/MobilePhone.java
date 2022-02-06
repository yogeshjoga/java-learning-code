package OOpsPra;
import d_Inheritance.Mobile;
import java.util.Scanner;
import java.io.*;
public class MobilePhone {
    public void mobileSpecfications(){
        Mobile obj = new Mobile();
        //Scanner inputs
        //std Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the your std and time price per minute : ");
        double std = sc.nextDouble();
        double stdTime = sc.nextDouble();
       // istd inputs
        System.out.println("\nEnter the your istd call rate and time : ");
        double istd = sc.nextDouble();
        double istdTime = sc.nextDouble();
       // battery inputs
       System.out.println("\nEnter the your mobile Battery Capacity : \nbattery Charging Time \nBattery Discharge Time ");
       double batMah = sc.nextDouble();
       double batChar = sc.nextDouble();
       double batDis = sc.nextDouble();
       // camera inputs
       System.out.println("\nEnter your phone Camera MP front and back : ");
       String froCam = sc.next();
       String rarCam = sc.next();
       // os type and os version
       System.out.println("\nEnter your Mobile os type and os version ");
       String osModel = sc.next();
       String osVer = sc.next();
       obj.stdCallsRates(std,stdTime);
       obj.istdCallsRates(istd,istdTime);
       obj.batteryCapcity(batMah,batChar,batDis);
       obj.batteryCapcity(batMah,batChar,batDis);
       obj.mobileOs(osModel,osVer);

    }
    public static void main(String[] args) {
        MobilePhone obj1 = new MobilePhone();
        obj1.mobileSpecfications();
    }
    
}
