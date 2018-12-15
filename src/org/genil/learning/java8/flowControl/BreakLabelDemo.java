package org.genil.learning.java8.flowControl;

/**
 * Created by genil on 12/13/18 at 18 02
 **/
public class BreakLabelDemo {
    public static void main(String[] args) {
        foreach:
        for (int j=0;j<5;j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(" "+j);
                if(j == 3 && k == 1) {
                    System.out.println("BReaking foreach");
                    continue foreach;
                }
//                System.out.println(" k "+k);
                if(j==0 || j == 2) {
//                    System.out.println("j = 0 or 2");
                    break ;
                }
            }
        }
    }
}
