package Refelection_api;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HelloRef {


    int hello;
    String name;
    String village;
    String whre;
    String whom;
    long phNo;

    public static void main(String[] args) {

        HelloRef hel = new HelloRef();
        Field[] cl =  hel.getClass().getDeclaredFields();


        for(Field f : cl){
            System.out.println(f);
        }


        // printing
        Map<String, Integer> map = new HashMap<>();
        map.put("hello ",83794);
        map.put("hello man", 989438);
        map.put("hell33",938034);

       map.entrySet().forEach(n -> System.out.println(n));
       System.out.println("-------------------printing----------------------");
       map.forEach((key,value) -> System.out.println(key+value));
    }


}
