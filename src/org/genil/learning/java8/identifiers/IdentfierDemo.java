package org.genil.learning.java8.identifiers;

/**
 * Created by genil on 1/5/19 at 16 57
 **/
public class IdentfierDemo {

    static int si = 10;

    IdentfierDemo() {
        si += 20;
    }

    int i;
    final  boolean aBoolean;
    {
        aBoolean = false;
        i = 232;
    }


    public static void main(String[] args) {
        int __1 =2;
        int $_123;
        int $123;

        int x = 1, y =2;

        System.out.println(1+2 + "3"); // 33

        System.out.println("Values : "+1+2); // values 12

        System.out.println(4+1.0f); //5.0f

        System.out.println(5.0/4); // 1.25
        System.out.println(5/4); //1

//        System.out.println(null+null);

//        System.out.println(null +true);
//        System.out.println(true + null);

    }
}
