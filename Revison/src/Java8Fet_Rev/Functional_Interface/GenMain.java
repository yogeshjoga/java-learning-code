package Java8Fet_Rev.Functional_Interface;

/**
 *
 * <p>Calling the Generics of functional interface method by using Lambda Expressions</p>
 *
 * @author <b>Yogesh Joga</b>
 */
public class GenMain {


    public static void main(String[] args) {

        // for Int type
        GenricFunInterface<Integer> gen = ((a,b) -> {
            long c = a+b;
         //   System.out.println(c);
            return (int)c;
        });

        // for Long type
        GenricFunInterface<Long> gen1 = ((n,m) ->{
            return n+m;
        });


        var hel1 = 250;
        var hel2 = 251;
        int ans = gen.add(hel1, hel2);
        System.out.println(ans);

        var hel11 = 444L;
        var hel22 = 74837L;
        long ansL =gen1.add(hel11,hel22);
        System.out.println(ansL);

        System.out.println("hello this is test");
    }
}
