import java.lang.invoke.CallSite;
import java.util.Scanner;

public class BaseBall {
    /**
     * An integer  Record a new score of x
     * + Record a new score that is the sum ofthe previous two
     * D record a new score that is double the previous score.
     * C invalidate the previous score removing ti from the record.
     */
    public static int calPoint(String [] ops){
        String s = "D"; // short
        String s1 = "C";// out
        String s2 = "+";// bonus double
        String currentScore = "";
        int j,i;
        int score ;

        String [] totalScore;

        for( i=0; i<=ops.length; i++){
            for( j=0; j<=9; j++){
                if(ops[i].equals(j)){
                    currentScore += ops[i];
                }
            }
            
            if(ops[i].equals(s1)){
                // C caught the ball so out 
           //   currentScore = ops.remove(--ops[i]);
            }
            else if(ops[i].equals(s)){
                score = Integer.parseInt(currentScore);

            }
        }


    }
 









    public  int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int totalScore = 0;
        for (String op : ops) {
            if (op.equals("D")) {
                int newScore = 2 * stack.peek();
                totalScore += newScore;
                stack.push(newScore);
            } 
            else if (op.equals("C")) {
                totalScore -= stack.pop();
            }
             else if (op.equals("+")) {
                int scoreTwo = stack.pop();
                int newScore = scoreTwo + stack.peek();
                stack.push(scoreTwo);
                stack.push(newScore);
                totalScore += newScore;
            } 
            else {
                stack.push(Integer.parseInt(op));
                totalScore += Integer.parseInt(op);
            }
        }
        return totalScore;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ops[];
        for(int i=0; i<=10;i++){
         ops[i] = sc.next();
        }
        BaseBall.calPoint(ops);
    }
}