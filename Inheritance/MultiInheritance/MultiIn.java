// Multi Inhertance progeramming 
class Animals{
    void behivor(){  //Super class 
        System.out.println("it as having four legs");
        System.out.println(" it is walking and running");
        System.out.println("crying and laughing");
        System.out.println("jumping ");
    }
}
class Dogs extends Animals{ // 1st child class to Animal class
    Animals dogg = new Animals();
    void dogsBow(){
        System.out.println("i have these behivors ");
        dogg.behivor();
        System.out.println("i am Brakking like Boww Boww");
    }
}
class GermanSherphed1 extends Dogs{ // child calss to Dogs class
    void germanShe(){
        System.out.println(" im a German Sherphed");
        Dogs ddd = new Dogs();
        ddd.dogsBow();
    } 
}
public class MultiIn { // maiin class
    static void disply(){
        System.out.println("WelCome This is the Multi Inhertance...");
    }
    public static void main(String[] args) { // main method 
        disply();
        GermanSherphed1 ger = new GermanSherphed1();
        ger.germanShe();
    }
}
