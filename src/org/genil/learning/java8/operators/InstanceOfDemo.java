package org.genil.learning.java8.operators;

import org.genil.learning.java8.basics.inheritance.SuperBirdInt;
import org.genil.learning.java8.initBlocks.InitDemoWithConstructor;

/**
 * Created by genil on 1/5/19 at 21 51
 **/
public class InstanceOfDemo {
    public static void main(String[] args) {
        String string = "some string";

//        if(string instanceof Integer) { // fails to compile
//
//        }


        Child child = new Child();

        if(child instanceof Parent) {

        }

        if (child instanceof GrandChild) {

        }

//        if(child instanceof Bat) { //compile time error.. what is Bat to do with child?

//
//        }

        if(child instanceof Bird) {

        }

        if(child instanceof SuperBirdInt) { // wow okay !

        }



        Child[] children = new Child[2];

        if( children instanceof  Child[]) {

        }

        if(children instanceof Parent[]) {

        }

        Bird chittuKuruvi = new ChittuKuruvi();

        if(chittuKuruvi instanceof  Bird) {
            System.out.println("Chittukuriv is  a bird");
        }

        Racquet racquet = new Racquet();

        if(racquet instanceof Bird) { // never true, but compiles because of Bird INterface
            System.out.println("racquet is a bird? NO way this print");
        }

        short s = 9;

//        Short aShort = new Short(9); // fail to compile
        Short aShort = new Short(s);

        Integer aIntegr = 9;

//        System.out.println(aShort == aIntegr);
        System.out.println(s == aIntegr);


        Parent[] parents;

//        if(children instanceof parents) {
//
//        }
//        if( children instanceof  Child) {
//
//        }

    }
}

class Parent {

}

class Child extends  Parent {

}

class GrandChild extends Child {

}

class Racquet {

}

interface Bird {

}


class Kuruvi implements Bird{

}

class ChittuKuruvi extends Kuruvi {

}
