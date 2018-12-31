package udemy.test1;

import udemy.test1.pkg1.A;

/**
 * Created by Antony Genil Gregory on 12/23/2018 12:33 PM
 * For project : Java8Cert
 **/
public class B extends A {
    public void print() {
        A obj = new A();
        System.out.println(obj.i1); //Line 8
//        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
        System.out.println(this.i2); // is okay

    }

    public static void main(String [] args) {
        new B().print();

    }

}
