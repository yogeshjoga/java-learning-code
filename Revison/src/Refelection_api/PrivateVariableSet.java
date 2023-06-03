package Refelection_api;

import java.lang.reflect.Field;

public class PrivateVariableSet {

    private final String myName;

    public PrivateVariableSet(String myName) {
        this.myName = myName;
    }

    public  String getMyName(){
        return myName;
    }


    public static void main(String[] args) throws Exception{
        System.out.println("default --------------- yogesh");

        /**
         * reflection api used to and manipulate the final variable
         */


        PrivateVariableSet pt = new PrivateVariableSet("yogesh");
        // printing the object values
        System.out.println(pt.getMyName());

        Field [] fl = pt.getClass().getDeclaredFields();
       // fl.forEach(n -> System.out.println(n));
        for(Field f: fl){
            if(f.getName().equals("myName")){
                System.out.println("Updated");
                f.setAccessible(true);
                f.set(pt,"Hello billa I am hack your system");

            }
        }
        // after updating the variable printing
        System.out.println(pt.getMyName());
    }
}
