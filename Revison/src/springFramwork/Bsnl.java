package springFramwork;

public class Bsnl implements  Sim{
    @Override
    public void calling() {
        System.out.println("Calling from BSNL sim card");
    }

    @Override
    public void internet() {
        System.out.println("Internet from BSNL sim card");
    }
}
