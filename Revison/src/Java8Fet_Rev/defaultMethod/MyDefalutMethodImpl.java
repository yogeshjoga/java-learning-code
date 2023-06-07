package Java8Fet_Rev.defaultMethod;

import Collections.MyIntraface;
import Collections.MyIntrafaceImpl;

public class MyDefalutMethodImpl implements MyDefaultInterface {


    /**
     * <p>Here, I am @override only one method still it's not getting any error in my current implemented class
     * why? Because already implemented class is there in MYInteraface </p>
     * @return
     * @see Override
     * @see MyIntraface
     * @see MyIntrafaceImpl
     * @author <strong>Yoges joga</strong>
     */

    @Override
    public int add() {
        var a = 20;
        var b = 30;
        var c = a + b;
        System.out.println(c);
        return c;
    }


    public static void main(String[] args) {
        MyIntrafaceImpl ll = new MyIntrafaceImpl();
        ll.add();

    }
}
