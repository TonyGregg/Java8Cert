package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 11/8/18 at 08 29
 **/

class Dog1 {
    public void bark() {
        System.out.println("woof ");
    }
    public static void sing() {
        System.out.println("sing..");
    }
}
class Hound extends Dog1 {
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
        ((Dog1) new Hound()).bark(); // hawl
//        ((Dog1) new Hound()).sniff(); // failed to compile


        // if you really want dog - parent object to call new sniff

        Dog1 dog1 = new Hound(); // parent = child
        // and then

        ((Hound)dog1).sniff(); // parent casted to child and child calls the child method

        Hound hound = (Hound) dog1;
        hound.sing();




    }
    public void doSomething(Dog1 dog11, Hound hound ) {

        hound = (Hound)dog11; // child casted parent
    }
    // hawl hawl
}
