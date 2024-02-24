package HashMapAndHashSet;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {


    public static void main(String[] args) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        hMap.put(1,1);
        hMap.put(2,4);
        hMap.put(3,6);
        hMap.put(4,10);

        System.out.println(hMap.containsValue(6));
        System.out.println(hMap.containsKey(2));
        hMap.putIfAbsent(4,8);
        System.out.println(hMap);
        System.out.println(hMap.keySet());

        for(Map.Entry m : hMap.entrySet() ){
            System.out.println(m+"  --- from entry set");
        }

        double mod = 1e9;
        System.out.println(mod);

        
    }
}
