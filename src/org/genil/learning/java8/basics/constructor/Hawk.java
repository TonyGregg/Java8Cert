package org.genil.learning.java8.basics.constructor;

/**
 * Created by genil on 11/7/18 at 18 06
 **/

class Bird {
    {
        System.out.print("b1 ");

    }
    Bird() {
        eat();
        System.out.print("b2 ");
    }
    public void eat() {
        System.out.println("Bird eating. ..");
    }
}

class Raptor extends Bird {
    static {
        System.out.print("r1 ");
    }
    public Raptor() {
        System.out.print("r2 ");
    }
    {
        System.out.print("r3 ");
    }

    static {
        System.out.print("r4 ");
    }
    public void doRapt() {
        System.out.println("Rafting ...");
    }
}

public class Hawk extends Raptor{
    public static void main(String[] args) {
        System.out.print("pre ");
        new Hawk();
        System.out.println("hawk");

        System.out.println(" --------------- --------------------- ---------");

        Bird bird = new Bird();
        Raptor raptor = new Raptor();

//        raptor = bird; // fail at compile time.. bird cannot be assigned to child raptor

        bird = raptor;

        ((Raptor) bird).doRapt(); // if the above line bird = raptor does not exist, this line will fail at runtime

        ((Bird)raptor).eat();

        ((Bird) new Raptor()).eat();

//        ((Raptor)new Bird()).doRapt(); // Fails at runtime.. class cast exception
    }
}

/**
 * output
 *
 * r1 r4 pre r2 r3
 */
