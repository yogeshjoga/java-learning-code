package genriecs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * <p>All the collections are supported heterogeneous dataTypes</p>
 *
 * @see java.util.Collections
 * @see List
 * @see ArrayList
 * @see java.util.Map
 * @see java.util.Stack
 * @see java.util.Set
 * @author <b>Yogesh Joga</b>
 */
public class MyGen {

    public static void main(String[] args) {
        // Object
        MyGen gen = new MyGen();
        gen = null;

        // new List Object
        List li = new ArrayList();
        li.add("hello"); // String
        li.add(3879329); // int
        li.add(1.0000000000000); // double
        li.add(787878.0900909090F); // float
        li.add(872389278327893L); // long
        li.add(gen); // object

        // printing
        System.out.println(li);


        // using Stream api to filter the only objects
        List obj = (List) li.stream().filter(Objects::isNull).collect(Collectors.toList());
        System.out.println(obj.size());
    }
}
