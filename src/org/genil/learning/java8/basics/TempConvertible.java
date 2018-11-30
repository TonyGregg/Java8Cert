package org.genil.learning.java8.basics;

/**
 * Created by genil on 10/22/18 at 08 25
 **/
public interface TempConvertible {
    static int getCtoF(int cTemp) {
        /*
            F = (C*9/5)+32

            F-32 = (C*9/5)

            F-32 = C*1.8

            C*1.8 = F-32
            C = (F-32)/1.8



         */
        return (cTemp*9/5)+32;
    }

    static int getFtoC(int fTemp) {
        //C = (F-32)/(5/9)
        return (int)((fTemp-32)/1.8);
    }
}
