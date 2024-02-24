package BitManupulaiton;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        Double a = 100.0;
        Double b = 100.0;
        Double c = 500.0;
        Double d = 500.0;


        System.out.println("Dobule----------------------");
        System.out.println(a == b );
        System.out.println(c == d );


        Long e = 100L;
        Long f = 100L;
        Long g = 500L;
        Long h = 500L;
        System.out.println("Long---------------------------------");
        System.out.println(e == f); // true
        System.out.println(g == h); // true

        Float i = 100.0f;
        Float j = 100.0f;
        Float k = 500.0f;
        Float l = 500.0f;
        System.out.println("Float-----------------------");
        System.out.println(i == j); // true
        System.out.println(k == l); // true

        Short m = 100;
        Short n = 100;
        Short o = 500;
        Short p = 500;
        System.out.println("Short--------------------------");
        System.out.println(m == n); // true
        System.out.println(o == p); // true

        Integer q = 100;
        Integer r = 100;
        Integer s = 500;
        Integer t = 500;
        System.out.println("Integer--------------------------");
        System.out.println(q == r); // true
        System.out.println(s == t); // false
    }
}
