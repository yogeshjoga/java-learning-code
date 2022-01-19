/* Question number one is 
write a programm to create the buleprint circle with properties requried to find area of circle and a behavior called area of cricle.
whichfinds the circle area for given radus create a user logic with circle objects differnt radius and display these area.
*/
public class Circle { // this is the business logic why because it as no main method.
    double rad;
    static double pi = 3.14;
    public void circleArea(double a){
        double totalCircalArea;
        this.rad=a;
       // System.out.println("Enter Circle Radius : ");
        totalCircalArea = Circle.pi*this.rad*this.rad;
        System.out.println("The total area of Circle is : "+totalCircalArea+"\n");
    }
    
}
