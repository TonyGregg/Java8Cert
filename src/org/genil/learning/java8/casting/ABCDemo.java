package org.genil.learning.java8.casting;

/**
 * Created by Antony Genil Gregory on 12/29/2018 3:08 PM
 * For project : Java8Cert
 **/
public class ABCDemo {
    public static void main(String[] args) {
        A o1 = new C( );
        B o2 = (B) o1;
        System.out.println(o1.m1( ) ); // 10
        System.out.println(o2.i ); // 20

        o2 = (C)o1;

        System.out.println(o2.i ); // 20

        C o3 = (C) o2;

        System.out.println("c's "+o3.i);

        A a = new A();
        B b = new B();
        a = b;
        System.out.println("a's class "+a.getClass()+ " b's class "+b.getClass());
    }
}

class A { int i = 10;  int m1( ) { return i; } }
class B extends A { int i = 20;  int m1() { return i; } }
class C extends B { int i = 30;  int m1() { return i; } }
