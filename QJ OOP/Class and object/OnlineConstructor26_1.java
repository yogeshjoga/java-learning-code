public class OnlineConstructor26_1 {
    double length, bearth;
    OnlineConstructor26_1 (double length, double bearth){
        this.length = length;
        this.bearth = bearth;

    }
    public void areaOfReactangle(){
        System.out.println(" Total  area of Reactangle is : "+this.length * this.bearth);
    }
}

class Furniture{
    public static void main(String[] args) {
        System.out.println("This is the user logic");
        OnlineConstructor26_1 con = new OnlineConstructor26_1(20.2, 10.33);
        con.areaOfReactangle();
        System.out.println("--------------------------------");
        
    }
}