package org.genil.learning.java8.chap6;

import java.util.ArrayList;

/**
 * Created by genil on 12/14/18 at 17 55
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        System.out.println("size "+cities.size());

        cities.add("NY");
        cities.add("SFO");
        cities.add("TPA");
        cities.add("ATL");
        cities.add("TPA");
        cities.add("MIA");


        System.out.println("Indiex of TPA "+cities.indexOf("TPA"));

        cities.remove("TPA");
        System.out.println(cities);

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(2); // okay ! auto wrap, box done

        Integer i1 = 200;
        Integer i2 = 200; //till 127 it compares...

        if(i1 != i2)
            System.out.println("different objects");

        if(i1 == i2)
            System.out.println("same objects");
    }
}
