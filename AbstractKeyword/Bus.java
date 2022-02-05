import java.rmi.server.RemoteRef;

abstract class Bus extends Vehicles{
    int noOfWheelsInBus;
    double topSpeedInBus;
    double engineCapcityBus;
    int numberOfCylindersBus;
    double torqueOfVehicleBus;
    public int noOfWheelsBus(int noOfWheelsInBus){
        this.noOfWheelsInBus = noOfWheelsInBus;
        return this.noOfWheelsInBus;
    }
    public double topSpeedBus(double topSpeedInBus){
        this.topSpeedInBus = topSpeedInBus;
        return this.topSpeedInBus;
    }
    public double engineCapcityBus(double engineCapcityBus){
        this.engineCapcityBus = engineCapcityBus;
        return this.engineCapcityBus;
    }
    public int numberOfCylindersBus(int numberOfCylindersBus){
        this.numberOfCylindersBus = numberOfCylindersBus;
        return this.numberOfCylindersBus;
    }
    public double torqueOfVechicleBus(double torqueOfVehilceBus){
        this.torqueOfVehicleBus = torqueOfVehilceBus;
        return this.torqueOfVehicleBus;
    }
}
