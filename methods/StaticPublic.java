public class StaticPublic {
    static void cars(){
        String gearBox = "6 transmission GearBox";
        String streeing = "Power streeing";
        int topSpeed =560;
        System.out.println();
        System.out.println("*************This is the Method Static and Public*******************");
        System.out.println();
        System.out.println("==============Static Method===========");
        System.out.println("Gear box type is        : "+gearBox);
        System.out.println("Streeing type is        : "+streeing);
        System.out.println("Top Speed of the car is : "+topSpeed);
        System.out.println();
        

    }
     void parts(){
        String powerTransmission = "Propeller Shaft";
        String tyres = "Off Road";
        int no_Of_Tyres = 8;
        System.out.println();
        System.out.println("============Public Method==========");
        System.out.println("Type of the power Transmission is : "+powerTransmission);
        System.out.println("Type of Tyrs in car is            : "+tyres);
        System.out.println("Number of Tyres in car is         :  "+no_Of_Tyres);
        System.out.println();

    }

    public static void main(String[] yogi){
        cars();
        StaticPublic carSpars = new StaticPublic();
        //System.out.println(carSpars.parts());
        carSpars.parts();

    }
    
}
