package Java8Fet_Rev.forEachMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <p>
 * <b>Java Collections we can iterate the collection of objects</b>
 *     <ol>
 *         <li>For loop</li>
 *         <li>Enhanced For Loop</li>
 *         <li>ForEach Method</li>
 *         <li>Stream API</li>
 *     </ol>
 * </p>
 * @since <b>Java 1.8v Feature, forEach() method and Stream API</b>
 * @see java.util.Collections
 * @see java.util.List
 * @see java.util.Queue
 * @see java.util.Set
 * @see java.util.Map
 * @see java.util.ArrayList
 * @see java.util.LinkedList
 * @see java.util.Vector
 * @see java.util.Stack
 * @see java.util.PriorityQueue
 *
 *
 *
 * @author <b>Yogesh Joga</b>
 */
public class ForEachMethod {

    /**
     * <p>Adding list objects into a new ArrayList collection</p>
     * @param limit
     * @param list
     * @return
     */
    public  static ArrayList addColletions(int limit, ArrayList list){

        // adding the objects here
        for(int i=0; i<= limit; i++){
            list.add(i);
        }
        return list;
    }

    /**
     *
     * <p>Reading the ArrayList objects only by one</p>
     * @see ArrayList
     * @see java.util.List
     */
    public  static void readCollection(){
        // creating a new Collection List object
        ArrayList<Integer> list = new ArrayList<>();
        int listSize = 1000000;
        addColletions(listSize, list);
        // Read the collections by using forEach method
        list.forEach(n -> System.out.println(n));
    }

    public static void readForEachMethRef(){

        // List Object creation
        ArrayList<Integer> list = new ArrayList<>();

        // initiate the size of the list adding
        int listSize = 123;

        // Adding the elements from addCollection method
        addColletions(listSize, list);

       // list.forEach( System.out::println());


        System.out.println("Stream --- System.out::println");
        // Stream API used
        list.stream().forEach(System.out::println);


    }

    /**
     * <p>Main method, </p>
     * @param args
     */
    public static void main(String[] args) {
        readCollection();
        readForEachMethRef();
        System.out.println("Done");
    }
}