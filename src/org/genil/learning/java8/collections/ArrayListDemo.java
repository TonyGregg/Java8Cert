package org.genil.learning.java8.collections;

import java.util.ArrayList;

/**
 * Created by anton on 6/22/2018 5:52 PM
 **/
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }


        for (int element: arrayList) {
            System.out.println("Element : "+element);
            // following code will result in concurrent modification exception
            /*if(element == 50) {
                arrayList.remove(50);
            }*/

            if(element == 5) {
                arrayList.set(7,500);
            }

        }
    }
}
