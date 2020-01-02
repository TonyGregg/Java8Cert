package org.genil.learning.java8.casting;

/**
 * Created by genil on 1/7/19 at 11 21
 **/
public class OverLoadDemo {
    public void demo(int... x) {
        System.out.println(" in int......");
    }
//    public void demo(int x) {
//        System.out.println("in int ");
//    }
//    public void demo(Integer x) {
//        System.out.println(" In Integer ");
//    }

//    public void demo(long l) {
//        System.out.println("in long");
//    }
//    public void demo(Long l) {
//        System.out.println("in Long");
//    }
    public void demo(Object object) {
        System.out.println("in object");
    }

    public static void main(String[] args) {
        Integer x = 20;
        int i =2;

        OverLoadDemo demo = new OverLoadDemo();

        demo.demo(x);

        demo.demo(2); //long

        demo.demo(20); //long

        demo.demo(i);

        double d = 2;
//        demo.demo(d); // calls Object


    }


}
