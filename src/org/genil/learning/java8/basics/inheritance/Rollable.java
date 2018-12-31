package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 10/11/18 at 17 34
 **/
public interface Rollable  {
    public void roll();
    public default int getBounceFactor() {
        return 5;
    }

    public int A = 1; //1
    int B = 1;          //2
    static int C = 1;  //3
    final int D = 1; 	 //4
    public static int E = 1; //5
    public final int F = 1;  //6
    static final int G = 1;    //7
    public static final int H = 1; //8
}
