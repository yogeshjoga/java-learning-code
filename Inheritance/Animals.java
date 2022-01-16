
 class Dogs extends Animals{
    void germanSherphed(){
        System.out.println("Name is german sherphed");
        System.out.println(" Maximum living is 13 years");
        System.out.println(" cost is 20k to 150k");

    }
    void goldenRetiver(){
        System.out.println("Name is Golder Retiver");
        System.out.println(" Maximum living is 10 years");
        System.out.println(" cost is 20k to 80k");

    }
    void labrativer(){
        System.out.println("Name is lab");
        System.out.println(" Maximum living is 12 years");
        System.out.println(" cost is 20k to 90k");

    }
}
 class Cats extends Animals{
    void mainCoon(){
        System.out.println("Name is Main coon");
        System.out.println(" Maximum living is 10 years");
        System.out.println(" cost is 20k to 140k");

    }
    void indianCat(){
        System.out.println("Name is  Indian Cat");
        System.out.println(" Maximum living is 15 years");
        System.out.println(" cost is 20k to 40k");

    }
    void parisenCat(){
        System.out.println("Name is parise Cat");
        System.out.println(" Maximum living is 15 years");
        System.out.println(" cost is 20k to 160k");

    }

}
 class Lions extends Animals{
    void indianLion(){
        System.out.println("Name is Indian Lion");
        System.out.println(" Maximum living is 25 years");
        System.out.println(" cost is 20k to 1000k");

    }
    void africaLion(){
        System.out.println("Name is African Lion");
        System.out.println(" Maximum living is 50 years");
        System.out.println(" cost is 20m to 150m");

    }

}
public class Animals {
    void animals(){
        System.out.println(" It has four leg's animal  Name as : ");
    }

    public static void main(String[] args) {
        Lions gu = new Lions();
        Cats cu = new Cats();
        Dogs do1 = new Dogs();
        do1.animals();
        cu.animals();
        gu.animals();
        gu.indianLion();
        gu.africaLion();


    }
}
