package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * @author yogesh joga
 */

public class JavaLinkedList {


    /**
     * java linkedList by default implements List and Deque Interfaces
     *
     * <strong>some_importent_Question_need_to_Remeber </strong>
     * <ul>
     * <strong>
     *  <li> What is the Default Capacity?  --> Zero  </li>
     *  <li> What is the Initial Capacity?  ---> Zero  </li>
     *  <li> Does it allow Duplications elements ---> Yes  </li>
     *  <li> Does it allow null values? ---> Yes it will  </li>
     *  <li> Does it maintain the insertion order? ---> Yes it will </li>
     *  <li> Does it maintain the sorted order? --> <p> No, It won't allow why becoz the linkedList is based
     *                                              on Reference linked Ex: prev and next Node so, the body
     *                                              of values doesn't allow sorted order.</p>  </li>
     *  <li> Does it offer the random access of Elements? ---> Yes by using get() method we need to pass index. </li>
     *  <li> Is it synchronised? --> By Default LinkedList not syncronised but in collections it is.   </li>
     *  <li> What is it Good at -->  Removing and Adding the elements very fast  </li>
     *  </strong>
     *  </ul>
     *  @author <strong> Joga Yogesh</strong>
     * @see LinkedList
     * @see List
     * @see Queue
     * @since  1.7
     *
     */

    public static void linkedListExample(){
        // let's go some of the examples


        // this is valid syntax for normal LinkedList

        // its allow both List and Queue implemented methods we can manipulate the data
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(989);
        ll.add(9898);

        // this is also valid syntax. why becoz LinkedList already implements the List interface
        // it allow the all List implemented Methods
        List<Integer> lLL = new LinkedList<>();
        lLL.add(893849);
        lLL.add(9384);

        // this is also valid syntax. why becoz LinkedList Implements both the List and Queue Interfaces
        // its allow the all Queue implemented methods
        Queue<Integer> qLL = new LinkedList<>();
        qLL.add(29384);
        qLL.add(932849);

    }


    /**
     *
     * <strong> why-LinkedList-came-into-picture?  </strong>
     *
     * <p> <strong>Ans: </strong> Why because, while using the ArrayList in best case reading and search elements is very fast,
     *       when comes to the Adding or Deleting in the middle of List Element it will take more time
     *       why because Ex: we have ArrayList size is 100, if we add the element in 2nd position of the
     *       ArrayList remaining the all the elements are shift to next position, it will take more time
     *       O(n) time complexity.
     *       If we use linkedList, The reference will point to prev and next Node of the element, It will
     *       make life easier while Inserting or Deleting the Element from List of Object. </p>
     */
    String question = "linkedList";


    /**
     * @show all
     * @see LinkedList
     * @param main
     */
    public static void main(String[] args) {

    }
}
