package org.genil.learning.java8.casting;

/**
 * Created by Antony Genil Gregory on 12/29/2018 3:08 PM
 * For project : Java8Cert
 **/
public class ABCDemo implements I1, I3, I2{
    public static void main(String[] args) {
        A o1 = new C( );
        B o2 = (B) o1;
        System.out.println(o1.m1( ) ); // 10
        System.out.println("o2.i = "+o2.i ); // 20
        System.out.println("02.m1 () : "+o2.m1());

        o2 = (C)o1;

        System.out.println(o2.i ); // 20

        C o3 = (C) o2;

        System.out.println("c's "+o3.i); // 30

        A a = new A();
        B b = new B();
        System.out.println("a.getClas "+a.getClass());
        a = b;
        System.out.println("a's class "+a.getClass()+ " b's class "+b.getClass());


//        System.out.println("What is the age "+AGE);// Compile time error
    }
}

class A { int i = 10;  int m1( ) { return i; } }
class B extends A { int i = 20;  int m1() { return i; } }
class C extends B { int i = 30;  int m1() { return i; } }

interface I1 {
    int AGE = 5;
}

interface I2 extends I1 {
    int AGE = 10;
}

interface I3 {
    int AGE = 20;
}
