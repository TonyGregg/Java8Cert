package org.genil.learning.java8.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by genil on 6/26/18 at 07 53
 **/
public class AssertTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all method..");
    }

    @BeforeEach
    public  void beforeEach() {
        System.out.println("before each method");
    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("AFtr all method");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each method. .");
    }



    @Test
    public void test() {
        assertEquals(12,12);
        assertEquals(true,true);

        assertTrue(Boolean.TRUE);
//        assertNull(new MathTester());
    }

    @Test
    public void test2() {
        System.out.println("test 2");
    }

}
