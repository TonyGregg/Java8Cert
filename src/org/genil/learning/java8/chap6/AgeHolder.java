package org.genil.learning.java8.chap6;

/**
 * Created by genil on 12/14/18 at 19 38
 **/
public class AgeHolder {
    private Integer myage = 38;

    StringBuilder stringBuilder = new StringBuilder("Rob");

    void printAge() {
        System.out.println("My age is "+myage);
    }

    Integer getAge() {
        return myage;
    }

    StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    void printString() {
        System.out.println(stringBuilder);
    }
}

class TestAge {
    public static void main(String[] args) {
        AgeHolder ageHolder = new AgeHolder();

        Integer age = ageHolder.getAge();

        age += 200;

        ageHolder.printAge(); // will print 38 only, because Integer is immutable just like String


        StringBuilder stringBuilder = ageHolder.getStringBuilder();

        stringBuilder.append(" Modify .. modify.. nalla modify");

        ageHolder.printString(); // Nalla modified all of it !


    }
}
