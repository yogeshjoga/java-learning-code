import java.util.Scanner;

public class ReactAngle3D {
    /*wap to create the bluerint of box, where in some boxes are 2-D and some are 3-D boxes create a method called as disply whichprovides 
    the properties of the box objects. create a user logic with 3 box object wehrein 2 boxes are 2-D and another 3-D boxes and siplay 
    their properties by calling disply behaviour. */
    double l, b, t ,h;
    ReactAngle3D(double l, double b){
        this.l=l;
        this.b=b;
        this.t = this.l*this.b;
        System.out.println("\n\nThe total area of the Reactangle is : "+ this.t+"\n\n");
    }
    ReactAngle3D(double l, double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
        this.t= this.l*this.b*this.h;
        System.out.println("The total volume of Rectangular cube is  : "+this.t+"\n\n");
    }

}

