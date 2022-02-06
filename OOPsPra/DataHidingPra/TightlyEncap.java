
public class TightlyEncap {
    private String carName;
    private int numOfWheels;
    private double numOfSeats;
    // fully  or tightly encapulation in the encapulation.
    // in every variable containing the private modifiyer is called the tightly encapulation.
    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getNumOfSeats() {
        return this.numOfSeats;
    }

    public void setNumOfSeats(double numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
    void display(){
        System.out.println("\n"+carName+"\n"+numOfWheels+"\n"+numOfWheels);
    }


}
