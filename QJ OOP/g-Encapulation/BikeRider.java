public class BikeRider {
    /* WAP to the blueprint of cike having any three properties and a behviour.
    Create a user logic with the  bike objedct wherein the user should not be 
    able to create the bike object with the property topspeed more thean the 220.00 according to govt.of india...
    If the user tries to create an object more then the given limit for topsped 
    then the topspeed should be se to 220.00 km/hr automatically. */


    // global members
    String bikeName ;
    double mileage;
    private double topSpeed;
    int transmission;
    public void bike(String bikeName, double mileage,double topSpeed, int transmission){
        this.bikeName = bikeName;
        this.mileage = mileage;
        this.transmission = transmission;
        if((topSpeed>0.0) && (topSpeed<220.00)){
            this.topSpeed = topSpeed;
        }
        else{
            this.topSpeed =220.00;
        }
    }
    void setTopSpeed(double topSpeed){
        if((topSpeed>0.0) && (topSpeed<220.00)){
            this.topSpeed = topSpeed;
        }
        else{
            this.topSpeed =220.00;
        }
    }
    double getTopSpeed(){
        return this.topSpeed;
    }
    void display(){
        System.out.println("Ride to GOA by my girlfriend : "+this.topSpeed);
    }

}
