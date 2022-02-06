// corruputed file some time this type of file will grenrated so dont worry yogi remember it okay
public class DataManuHid {
    private String mobileName;
    private double mobilePrice;
    private int mobileQnty;

    public String getMobileName() {
        return this.mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public double getMobilePrice() {
        return this.mobilePrice;
    }

    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public int getMobileQnty() {
        return this.mobileQnty;
    }

    public void setMobileQnty(int mobileQnty) {
        this.mobileQnty = mobileQnty;
    }
    void display(){
        System.out.println("\n"+mobileName+"\n"+mobilePrice+"\n"+mobileQnty);
    }

}


