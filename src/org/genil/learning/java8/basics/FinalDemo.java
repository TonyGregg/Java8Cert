package org.genil.learning.java8.basics;

/**
 * Created by genil on 11/29/18 at 17 15
 **/
public class FinalDemo {
    private final String name;
    FinalDemo() {
        System.out.println("inside constructor");
    }
    {
        name = "23";
        System.out.println("inside initialize block.. "+name);
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
    }

}
