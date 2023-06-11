package Java8Fet_Rev.StreamApi;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * <p>
 *     <ol>
 *         <li><b>Q. Where to use Collections and Stream API?</b></li> <br>
 *         <p><b>Ans: If we want represent Group of elements in a single Element we can go with Collection Api,<br>
 *         If we want to process the Objects from Collections we can better to go Stream Api</b></p>
 *         <li>Methods</li>
 *         <ol>
 *             <li> <b>filter(predicate)</b>this method expecting predicate(), Boolean's </li>
 *             <li><b>map(function)</b> this method expecting Function(), Processing the data  </li>
 *             <li>stream()</li>
 *             <li>filter()</li>
 *             <li>collect()</li>
 *             <li>count()</li>
 *             <li>sorted() this method expecting or we can pass Comparator object, Comparator is Functional interaface</li>
 *             <li>sorted(comparator)</li>
 *             <li>min(Comparator)</li>
 *             <li>max(Comparator)</li>
 *             <li>forEach()</li>
 *             <li>toArray()</li>
 *
 *        </ol>
 *     </ol>
 * </p>
 * @see java.util.stream.Stream
 * @see java.util.Collections
 * @see FunctionalInterface
 * @see java.util.function.Predicate
 * @see java.util.function.Function
 * @see Comparable
 * @see java.util.Comparator
 *
 * @author <b>yogesh Joga</b>
 */
public class MainStreamApi {


    public static void main(String[] args) {
        // creating one new ArrayList object with elements
       ArrayList<Integer> list = ExampleWithoutStreams.addingListObjWithoutStream(100);


       // filter method, even numbers
        List lifi = list.stream().filter(i -> i%2 ==0).collect(Collectors.toList());

        // printing the elements
        lifi.stream().forEach(System.out::println);

        // operation I*I
        List multival = list.stream().map(i -> i*i).collect(Collectors.toList());

        // printing the double values from list
        multival.stream().forEach(System.out::println);

        // total elements or objects count in a list
        // printing the count
        System.out.println(list.stream().count());

        // sorted the list of elements
        List sortedList = list.stream().sorted().collect(Collectors.toList());

        // printing the sorted list
        sortedList.stream().forEach(System.out::println);

        // sorted comparator descending order
        List sortedDec = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());

        // printing the soredDec
        sortedDec.stream().forEach(System.out::println);

        // min finding by using stream api
        Integer minf = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        // printing min values
        System.out.println(minf);

        // max finding by using stream api
        Integer maxf = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxf);


        // changing the collection object to Array
        // passing the constructor List to Integer Array constructor reference
        Integer[] arr = list.toArray(Integer[] :: new);

        // printing
        for(Integer i : arr){
            System.out.println(i);
        }


    }
}
