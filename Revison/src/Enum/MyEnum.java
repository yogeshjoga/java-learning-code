package Enum;

import java.util.EnumSet;
import java.util.stream.Stream;

public class MyEnum {


    /**
     *
     * Enums are the fix values
     * we need to assign the Enum type class name we need to user where we want the code
     * again and again no need to re edit or modifications
     * so enums are constents simply
     */

    public static void main(String[] args) {
        MyEnumImpl enum1 = MyEnumImpl.MYNAME;
        if(enum1 == MyEnumImpl.MYNAME){
            System.out.println("my name is yogesh");
        }
        /**
         * enum itration by using forEach methods
         *
         */

        // enums itratations
        EnumSet.allOf(MyEnumImpl.class).forEach(n -> System.out.println(n));


        // streams

        System.out.println("Stream printer");

        Stream.of(MyEnumImpl.values()).forEach(n -> System.out.println(n));

    }
}
