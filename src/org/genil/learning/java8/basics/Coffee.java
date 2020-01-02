package org.genil.learning.java8.basics;
import static java.lang.System.*;
import static java.lang.Integer.*;

/**
 * Created by genil on 9/13/18 at 08 17

 **/

 enum CofeeSize {
    SMALL(5), MEDIUM(12), LARGE(20);
    int cofeeSize;
    int var2;
    CofeeSize(int cofeeSize) {
        this.cofeeSize = cofeeSize;
    };

};

 public class Coffee {
    static CofeeSize someCoffee;
    public enum Days {MON,TUE,WED};

    public static void main(String[] args) {
        Days[] d2 =  Days.values();
        int size = someCoffee.LARGE.cofeeSize;
        for (CofeeSize cs : CofeeSize.values()) {
            System.out.println(cs+ " "+cs.cofeeSize + " how about var 2 "+cs.var2);
        }
        CofeeSize[] cofeeSizes = CofeeSize.values();

        out.println(cofeeSizes[2].name() );

    }
}

class StatTest {
    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
    }
}
