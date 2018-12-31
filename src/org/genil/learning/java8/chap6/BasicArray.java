package org.genil.learning.java8.chap6;

/**
 * Created by genil on 12/14/18 at 14 08
 **/
public class BasicArray {

   static Double[] instanceArr = new Double[2];

   static double[] instanceDoubleArr = new double[2];
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

//        int[] b2 = (int[]) o1;

        System.out.println(" b[1] = "+b[1]);

        Double[] arr = new Double[2]; //null

         double[] methodDpo = new double[2];


        System.out.println(arr[0] + " "+instanceArr[0] + " "+instanceDoubleArr[0] + " -- "+methodDpo[0]);  // null null 0.0 0.0

//        double ds = arr[0] + arr [1];
//
//        System.out.println("Uninizaliased array total "+ds);

        int [] arr1 = {1, 2, 3};
        char [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
//        arr1 = (int[]) arr2; // comile time error
//        arr1 = arr2; // comile time error
//        for(int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }




    }
}
