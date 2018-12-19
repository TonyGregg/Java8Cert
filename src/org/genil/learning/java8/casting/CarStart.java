package org.genil.learning.java8.casting;


import org.genil.learning.java8.defaultstatic.MyData;
import org.genil.learning.java8.defaultstatic.MyDataImpl;

/**
 * Created by genil on 12/17/18 at 17 10
 **/


interface Breakable {
    public void breakSmoothly();
}
interface Dummy {
    public void someDummyMethod();
}
class Car {
    public void accelerate() {

    }
}

class FancyCar extends Car {
    public void breakSmoothly() {
        System.out.println("Fancy car break smoothly");

    }
}

class SuperFancyCar extends FancyCar implements Breakable {
    @Override
    public void breakSmoothly() {
        System.out.println("inside super fancy car break smoothly ");
        super.breakSmoothly();
    }

    public void turn() {

    }
}
public class CarStart{
    public static void main(String[] args) {

        CarStart carStart = new CarStart();
        System.out.println(carStart.doMulti(5));

        FancyCar fancyCar = new FancyCar();
        print(fancyCar);
    }

    private int  doMulti(int x) {
        return (x++)*x;
    }

    private static void print(Car car) {
        ((Breakable)car).breakSmoothly();

        ((Dummy)car).someDummyMethod();

        ((AnotherDummy)car).anotherDummy();
        ((MyData)car).print(""); // it is all possible because of interface?????????????? weired ! but works
//        ((MyDataImpl)car).print(""); // class is not possible the least !!

    }
}
