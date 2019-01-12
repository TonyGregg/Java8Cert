package org.genil.learning.java8.chap5;

import org.genil.learning.java8.flowControl.ArgDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by genil on 1/4/19 at 15 37
 **/
public class ArrayDemo {

    char aChar;
    public static void main(String[] args) {

        ArrayDemo arrayDemo = new ArrayDemo();



        System.out.println("Defailt ch "+arrayDemo.aChar + " with cast "+(int)arrayDemo.aChar);
        String[] strings = new String[4];
        strings[1] = "A";
        strings [2] = "B";

        System.out.println("0%3 "+ (0%3));
        System.out.println("1%3 "+ (1%3));
        System.out.println("3%3 "+ (3%3));

        String[] strings1 = new String[] {"a","b"}; // 1 dimensional array




        int[] ints = {23,23,2232};
//        int[] ints1 = new int[2]{1,2}; error

        int[] ints2[] = new int[][] {{1,2}, new int[40]}; // perfectly okay !

//        System.out.println(ints[2][3]);

        try {



        for ( String data : strings) {
            System.out.println(data + " ");
        }

        }catch (Exception ex) {

        }
        m1(null);

    }

    public String accelserate() {
        return "Acces : car";
    }

    public int get(int x) {
        return ((20/x)/5);
    }

    private static void m1(Object object) {

    }

    private static void m1(FileNotFoundException fil) {

    }

    private static void m1(IOException ex) {

    }

//    private static void m1(String string) {
//
//    }


}
