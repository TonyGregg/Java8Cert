package org.genil.learning.java8.defaultstatic;

/**
 * Created by anton on 6/9/2018 3:53 PM
 **/
public interface MyData {

    default void print(String str) {
        if (!isNull(str))
            System.out.println("Interface Print::" + str);
    }

    default boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
