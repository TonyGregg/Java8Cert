package org.genil.learning.java8.basics.constructor;

/**
 * Created by genil on 12/2/18 at 12 30
 **/
public class Lion extends Animal{
    Lion() {
        super("Magesty Of Forest"); // if this is uncommented, Lion class will fail to compile

    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.name);
    }


}

class Animal {
    String name;
    Animal(String name) {
        this();// by default super() is inserted by compiler
        System.out.println("name of the animal "+name);
        this.name = name;
    }
    Animal() {
//        this(makeRandomNames());
        System.out.println("Inside no arg constructor");
        this.name = makeRandomNames();

    }
     String makeRandomNames() {
        int x = (int) (Math.random()*5);
         System.out.println("x = "+x);

        return new String[] {"Antony","Steffi","Chris","Elisha","Test"}[x];
    }

}
