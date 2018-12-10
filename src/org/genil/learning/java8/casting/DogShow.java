package org.genil.learning.java8.casting;

/**
 * Created by genil on 11/8/18 at 08 29
 **/

class Dog {
    public void bark() {
        System.out.println("woof ");
    }
    public void sing() {
        System.out.println("sing..");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.println("snif..");
    }
    public void bark() {
        System.out.println("hawl");
    }
}

public class DogShow {

    public static void main(String[] args) {
        new DogShow().go();
    }
    public void go() {

        new Hound().bark();
        ((Dog) new Hound()).bark(); // hawl
        ((Dog) new Hound()).sing(); // sing?

//        ((Dog1) new Hound()).sniff(); // failed to compile


        // if you really want dog - parent object to call new sniff

        Dog dog1 = new Hound(); // parent = child
        // and then

        ((Hound)dog1).sniff(); // parent casted to child and child calls the child method

        Hound hound = (Hound) dog1; // It appears child casted to parent, but it is not... it is from the child itself
        hound.sing();

//        Hound hound1 = (Hound) new Dog(); // Child casted to parent, will give classcast exception




    }
    public void doSomething(Dog dog11, Hound hound ) {

        hound = (Hound)dog11; // child casted parent
    }
    // hawl hawl
}
