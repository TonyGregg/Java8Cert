package org.genil.learning.java8.chap6;

/**
 * Created by genil on 12/14/18 at 14 08
 **/
public class BasicArray {
    public static void main(String[] args) {
        int []a, a1[];

        int[][] multi = new int[20][];

//        multi[0][0] =2; // runtime null ptr exception

        multi[0] = new int[3];

        multi[0] = new int[40];

        System.out.println(multi[0][0] + " length + "+multi[0].length);

        int[][] ints = {{3,4},{1,2}};

        int[] b = (int[]) ints[1];
        Object o1 = ints;

        int[][]a2 = (int[][]) o1;

        int[] b2 = (int[]) o1;

        System.out.println(" b[1] = "+b[1]);




    }
}
