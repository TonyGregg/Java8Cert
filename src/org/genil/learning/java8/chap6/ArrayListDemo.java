package org.genil.learning.java8.chap6;

import java.util.ArrayList;

/**
 * Created by genil on 12/14/18 at 17 55
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(200);

        System.out.println("size : "+cities.size());

        cities.add("NY");
        cities.add("SFO");
        cities.add("TPA");
        cities.add("ATL");
        cities.add("TPA");
        cities.add("MIA");

//        cities.add(200,"HALO");// null ptr exception


        System.out.println("Indiex of TPA "+cities.indexOf("TPA"));

        cities.remove("TPA");

        System.out.println(cities);

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(2);
        ages.add(20);
        ages.add(30);
        ages.add(1);

        System.out.println("Ages before remove : "+ages);

        ages.remove(1); // removes the index !!!

        ages.remove(new Integer(1)); // removes the obeject



        System.out.println("Ages "+ages);

        Integer i1 = 200;
        Integer i2 = 200; //till 127 it compares...

        if(i1 != i2)
            System.out.println("different objects");

        if(i1 == i2)
            System.out.println("same objects");
    }
}
