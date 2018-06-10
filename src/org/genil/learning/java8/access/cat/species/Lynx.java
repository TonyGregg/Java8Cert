package org.genil.learning.java8.access.cat.species;

import org.genil.learning.java8.access.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        /*System.out.println(cat.hasFur); // protected, use the sub class
        System.out.println(cat.hasPaws); // default package, cannot use it
        System.out.println(cat.id); // private man !*/

        Lynx lynx = new Lynx();
        System.out.println(lynx.hasFur); // goood
    }
}
