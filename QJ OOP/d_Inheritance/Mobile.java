package d_Inheritance;
public class Mobile {
    // This is the  IS-A Relationship
    // This is the SUPER CLASS
    double stdPrice;
    double istdPrice;
    double callerTime;
    double batteryCapacity;
    double batteryChargeTime;
    double batteryDischargeTime;
    String frontCamera;
    String rareCamera;
    String osType;
    String osVersion;

    public double istdCallsRates( double istdPrice, double callerTime){
       this.istdPrice = istdPrice;
       this.callerTime = callerTime;
       double totalCost =  istdPrice * callerTime;
       return totalCost;
    }
    public double stdCallerRates(double stdPrice, double callerTime){
        this.stdPrice = stdPrice;
        this.callerTime = callerTime;
        double totalCost = stdPrice * callerTime;
        return totalCost;
    }
    public double batteryCapcity(double batteryCapacity, double batteryChargeTime, double batteryDischargeTime ){
        this.batteryCapacity = batteryCapacity;
        this.batteryChargeTime = batteryChargeTime;
        this.batteryDischargeTime = batteryDischargeTime;
        System.out.println("\n"+this.batteryCapacity+"\n"+this.batteryChargeTime+"\n"+this.batteryDischargeTime);
        return 0;
    }
    public String camera(String frontCamera, String rareCamera){
        this.frontCamera = frontCamera;
        this.rareCamera = rareCamera;
        System.out.println("\n"+this.frontCamera+"\n"+this.rareCamera);
        return frontCamera;
    }
    public String mobileOs(String osType, String osVersion){
        this.osType = osType;
        this.osVersion = osVersion;
        System.out.println("\n"+this.osType+"\n"+this.osVersion);
        return  osVersion;
    }
}
//Complete the code to use child class by using inheritance concept HAPPY CODING.