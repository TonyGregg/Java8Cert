package org.genil.learning.java8.basics.inheritance;

import java.io.IOException;

/**
 * Created by genil on 10/4/18 at 07 59
 **/
public class Dog extends Animal {
    public Dog(String name) {
//        super();
//        this();
//        makeRandomName();
// it is either super or this must be the first line of constructor
//        super();
        System.out.println("dog's string constuctor. .Name of the dog is "+name);
        this.name = name;
        new Animal();

    }
    public Dog() {
        this(makeRandomName());

        System.out.println("inside Dog's default constructor");
    }

    String name;

    public void eat() throws NullPointerException {
        System.out.println("Eating dog food");
    }
    {
        System.out.println("instance block");
    }
    static String makeRandomName() {
        String name = null;
        int x = (int) (Math.random()*5);

        name = new String[]{"Fluffy","Fido","Rido","Nano","Large"}[x];

        return name;
    }

    public void doKaka() {
        System.out.println("Dog going kaka. ..");
    }

    public static void main(String[] args) {

        Animal animal2 = new Animal();
        try {
            animal2.eat();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animal animal = new Dog();

        Dog dog = new Dog("Tommy");
        ((Dog) animal).doKaka();
        dog.eat();
        try {
            animal.eat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void someMethod() {
        System.out.println("public final is allowed too..");
    }


}
