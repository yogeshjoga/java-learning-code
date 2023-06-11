package Java8Fet_Rev.StreamApi;


import javax.lang.model.element.Element;
import java.util.ArrayList;

/**
 *<p>With out using Stream Api, Adding elements into ArrayList and filtering the elements form ArrayList </p>
 * @see ExampleStream
 * @see ArrayList
 * @see java.util.List
 * @since <b>Java 1.7v</b>
 * @author <b>Yogesh Joga</b>
 */
public class ExampleWithoutStreams {


    /**
     *
     * <p>Adding the list of elements into new ArrayList Object and return to the filled Arraylist Object</p>
     * @param num
     * @return ArrayList
     */
    public static ArrayList<Integer> addingListObjWithoutStream(int num){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<num; i++){
            list.add(i);
        }
        return list;
    }


    /**
     * <p><b>For filtering we need to write this much of code
     * before java 1.7v </b></p>
     * @since  <b>Before-- Java 1.7v</b>
     * @param list
     * @return ArrayList
     */
    public static ArrayList findingEvenNumbers(ArrayList<Integer> list){
        ArrayList<Integer> li = new ArrayList<>();

        for(Integer i : list){
            if(i%2==0){
                li.add(i);
            }
        }
        // for printing
        System.out.println(li);
        return li;
    }

    /**
     * <p>doubling the list of elements in Arraylist Object</p>
     * @param list
     * @return
     */
    public static ArrayList<Integer> doubleTheValues(ArrayList<Integer> list){

        ArrayList<Integer> li = new ArrayList<>();
        for(Integer l : list){
            // double the element values
                li.add(l*l);
        }
        // just for printing into console
        System.out.println(li);
        return li;
    }

    /**
     * <p> Main method, flow started here </p>
     * @param args
     */

    public static void main(String[] args) {
        // for adding the list of elements into one ArrayList object
        ArrayList<Integer> li =addingListObjWithoutStream(100);

        // finding Even Number from ArrayList of Object
        findingEvenNumbers(li);

        // Doubling the ArrayList of elements
        doubleTheValues(li);
    }
}
