package org.genil.learning.java8.initBlocks;

/**
 * Created by genil on 12/4/18 at 08 30
 **/
public class Super1 {
    static {
        System.out.println("inside static super 1");
    }
}

class Super2  extends Super1{

    String string2 = m2("3");

    static {
        System.out.println("inside static super 2");
    }
    static String string = m2("2");

    Super2() {
        System.out.println("INside super2 constructor");
        superMethod1();
    }

    static void superMethod1() {
        System.out.println("Inside static method of super 2");
    }



    static String m2(String string) {
        System.out.println("inside m2, called from string static initializer : "+string);
        return string;
    }
}
