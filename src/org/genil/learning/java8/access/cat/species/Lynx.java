package org.genil.learning.java8.access.cat.species;

import org.genil.learning.java8.access.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        Lynx lynx = new Lynx();

        boolean f= lynx.hasFur; // will work
        /*System.out.println(cat.hasFur); // protected, cannot use it.. if you want use the sub class
        System.out.println(cat.hasPaws); // default package, cannot use it
        System.out.println(cat.id); // private man !*/

        System.out.println(lynx.hasFur); // goood
    }
}
