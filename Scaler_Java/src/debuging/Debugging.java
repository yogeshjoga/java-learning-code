package debuging;

import java.util.*;

public class Debugging {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,3,-1,-3,5,3,6,7);

        slidingMaximum(list, 3);

    }

    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (A.size() == 1 || B >= A.size()) {
            ans.add(Collections.max(A));
            return ans;
        }

        Deque<Integer> deque = new LinkedList<Integer>();

        for(int i=0; i<B; i++){
            while( !(deque.isEmpty()) &&  A.get(i) >= A.get(deque.peekLast())){
                deque.removeLast();
                // deque.add(A.get(i));
            }
            deque.addLast(i);
        }
        ans.add(A.get(deque.peekFirst()));

        for(int i = B; i<A.size(); i++){
            while( !(deque.isEmpty()) && deque.peekFirst() <= i-B){
                deque.removeFirst();
            }
            while( !(deque.isEmpty()) && A.get(i) >= A.get(deque.peekLast())){
                deque.removeLast();
            }
            deque.addLast(i);
            ans.add(A.get(deque.peekFirst()));
        }
        return ans;
    }

}
