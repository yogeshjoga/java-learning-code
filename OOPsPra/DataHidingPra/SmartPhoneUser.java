public class SmartPhoneUser {
    private String smartPhoneBrand;
    private double smartPhonePrice;

    public String getSmartPhoneBrand() {
        return this.smartPhoneBrand;
    }

    public void setSmartPhoneBrand(String smartPhoneBrand) {
        this.smartPhoneBrand = smartPhoneBrand;
    }

    public double getSmartPhonePrice() {
        return this.smartPhonePrice;
    }

    public void setSmartPhonePrice(double smartPhonePrice) {
        this.smartPhonePrice = smartPhonePrice;
    }
    void display(){
        System.out.println("\nYour phone brand and cost in below \n"+smartPhoneBrand+"\n"+smartPhonePrice+"\n");
    }

}
