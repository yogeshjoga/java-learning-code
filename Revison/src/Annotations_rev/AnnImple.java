package Annotations_rev;

import javax.lang.model.type.IntersectionType;
import java.util.HashMap;
import java.util.Map;

public class AnnImple {



    Map<String, Integer> map = new HashMap<>();
   // map.put("hello",9890809);


    @CalAnn()
    public static void hello(String hello, int num){
        System.out.println("hello this is yogesh");
    }

    public static void main(String[] args) {
        hello("hell",899898);
    }

}
