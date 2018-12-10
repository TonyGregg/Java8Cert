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
    static {
        System.out.println("inside static super 2");
    }
}
