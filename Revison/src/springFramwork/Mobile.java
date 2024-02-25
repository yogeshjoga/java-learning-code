package springFramwork;


/**
 *
 * @author <b>Yogesh Joga</b>
 */
public class Mobile {

    public static void main(String[] args) {

        // with-out spring


        // created a mobile class that's run the sim features from sim interface
        Sim sim = new Airtel(); // before sim we can create one one object to every sim card as well as mobile also
        // calling feature from sim
        sim.calling();
        // internet feature from sim
        sim.internet();



        // with spring
        // lets run it and configrure to spring module
        // crate spring project and run this code

      /*  ApplicationContext context = new ClassPathXmlApplicationContext( "web.xml");
        Sim simSp =  context.getBean("sim", Sim.class);
        simSp.calling();
        simSp.internet();

       */
    }
}
