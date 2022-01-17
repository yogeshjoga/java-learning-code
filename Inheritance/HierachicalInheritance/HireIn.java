// this is the multi Inhertance Class
class Animals{
    void wildAnimals2(){
        System.out.println("tiger");
        System.out.println("lion");
        System.out.println("fox");
    }
    void nonWildAnimals2(){
        System.out.println("Deer");
        System.out.println("goat");
        System.out.println("sheep");
        System.out.println("cow");
    }
}
class WildAnimals extends Animals{
      Animals an = new Animals();
      void eating1(){
            System.out.println(" \n\nit all are eating only non-veg like living things they are rabbits goats sheeps");
            an.wildAnimals2();
      } 
}
class NonWildAnimals extends Animals{
    Animals an1 = new Animals();
    void eating(){
        System.out.println(" \n\n it all are eating only veg like leaf's and plants");
        an1.nonWildAnimals2();
    }
}
public class HireIn {
    void AnimalsBeh(){
        System.out.println(" these are the animals ");
    }
    public static void main(String[] args) {
        WildAnimals wi = new WildAnimals();
        NonWildAnimals noW = new NonWildAnimals();
        wi.eating1();
        noW.eating();
        
    }
    
}
