package Java8Fet_Rev.forEachMethod;

import java.util.ArrayList;

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

    public  static ArrayList addColletions(int limit, ArrayList list){

        // adding the objects here
        for(int i=0; i<= limit; i++){
            list.add(i);
        }
        return list;
    }

    public  static void readCollection(){
        // creating a new Collection List object
        ArrayList<Integer> list = new ArrayList<>();
        int listSize = 1000000;
        addColletions(listSize, list);
        // Read the collections by using forEach method
        list.forEach(n -> System.out.println(n));
    }

    public static void main(String[] args) {
        readCollection();
    }


}
