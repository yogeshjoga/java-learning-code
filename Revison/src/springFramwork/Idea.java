package springFramwork;


/**
 *
 * @author <b>Yogesh Joga</b>
 */
public class Idea implements  Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Idea Sim card");
    }

    @Override
    public void internet() {
        System.out.println("Internet access from Idea sim card");
    }
}
