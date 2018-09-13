package org.genil.learning.java8.basics;

/**
 * Created by anton on 7/8/2018 2:01 PM
 **/
public class SwapTester {
    public static void main(String[] args) {
        String s1 = "Some str";
        SwapTester tester = new SwapTester();
        tester.swapStr(s1);
        System.out.println(s1); // No effect on String .. same goes with all other immutable objects

        Person person = new Person("An","greg@g",32);

        tester.modifyObject(person); // It modifies ...

        System.out.println(person);

    }

    private void swapStr(String s1) {
        s1 = "Some more "+s1;
    }

    private void modifyObject(Person person) {
        person.setEmail("dummy@dummy.com");
    }

}
