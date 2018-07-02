package org.genil.learning.java8.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by genil on 6/26/18 at 07 39
 **/

public class MathTester {
    @Test
    public void testSum() {
//        Object not_implemntd_yet_ = fail("Not implemntd yet ");


    }

    @Test
    public void sumWith3Numbers() {
        MyMath myMath = new MyMath();
        /**
         * Test with 3,5,2 and sum should be 10
         */

        int result = myMath.sum(3,5,2);
        assertEquals(10,result);

    }
}
