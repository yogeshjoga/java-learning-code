package springFramwork;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Airtel sim");
    }

    @Override
    public void internet() {
        System.out.println("Internet access from AirTel sim card");
    }
}
