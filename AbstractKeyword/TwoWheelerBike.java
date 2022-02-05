public class TwoWheelerBike extends Vehicles {
    int noOfWheelsInBike;
    double topSpeedInBike;
    double engineCapcityBike;
    int numberOfCylindersBike;
    double torqueOfVehicleBike;
    public int noOfWheels(int noOfWheelsInBike){
        this.noOfWheelsInBike = noOfWheelsInBike;
        return this.noOfWheelsInBike;
    }
    public double topSpeed(double topSpeedInBike){
        this.topSpeedInBike = topSpeedInBike;
        return this.topSpeedInBike;
    }
    public double engineCapcity(double engineCapcityBike){
        this.engineCapcityBike = engineCapcityBike;
        return this.engineCapcityBike;
    }

    public int numberOfCylinders(int numberOfCylindersBike){
        this.numberOfCylindersBike = numberOfCylindersBike;
        return this.numberOfCylindersBike;
    }
    public double torqueOfVehicle(double torqueOfVechicleBike){
        this.torqueOfVehicleBike = torqueOfVechicleBike;
        return this.torqueOfVehicleBike;
    }
}
