package Java8Fet_Rev.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @see ExampleWithoutStreams
 *
 * @since <b>Java 8 or 1.8v features</b>
 * @author <b>Yogesh Joga</b>
 */
public class ExampleStream {


    /**
     * <p><b>Here, I am using Stream Api, to filter the EVEN_NUMBERS and DOUBLING the all list of elements</b></p>
     * @param args
     */
    public static void main(String[] args) {

        // calling the add method from ExampleWithoutStreams class
        // this is static method so, no need to create new Object
        ArrayList<Integer> addList =  ExampleWithoutStreams.addingListObjWithoutStream(100);

        // filtering the list of elements, I need to create new List object to store the filter elements
        List list = addList.stream().filter(i -> i%2==0).collect(Collectors.toList());

        // printing the filtered elements
        System.out.println(list);

        // double the Every Element from the ArrayList
        // need to create new list for the storing
        List list2 = addList.stream().map(i -> i*i).collect(Collectors.toUnmodifiableList());

        // print the double values from shorted list
        System.out.println(list2);

    }
}
