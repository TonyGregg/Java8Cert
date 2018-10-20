package org.genil.learning.java8.basics.inheritance;

import java.io.IOException;

/**
 * Created by genil on 10/4/18 at 07 59
 **/
public class Dog extends Animal {
    public Dog(String name) {
//        super();
        this();
// it is either super or this must be the first line of constructor
//        super();
        System.out.println("Name of the dog is "+name);
        this.name = name;

    }
    public Dog() {
        System.out.println("inside Dog's default constructor");
    }

    String name;

    public void eat() throws NullPointerException {
        System.out.println("Eating dog food");
    }
    static String makeRandomName() {
        String name = null;
        int x = (int) (Math.random()*5);

        name = new String[]{"Fluffy","Fido","Rido","Nano","Large"}[x];

        return name;
    }

    public static void main(String[] args) {
        Animal animal = new Dog("Bommy");
        Dog dog = new Dog("Tommy");
        dog.eat();
        try {
            animal.eat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
