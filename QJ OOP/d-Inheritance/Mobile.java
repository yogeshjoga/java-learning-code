import javax.sql.rowset.spi.SyncResolver;

public class Mobile {
    // This is the  IS-A Relationship
    double stdPrice;
    double istdPrice;
    double callerTime;
    double batteryCapcity;
    double batteryChargeTime;
    double batteryDischargeTime;
    String frontCamera;
    String rareCamera;
    
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
    public double batteryCapcity()
}
