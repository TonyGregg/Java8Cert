package org.genil.learning.java8.chap6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Antony Genil Gregory on 12/30/2018 9:28 PM
 * For project : Java8Cert
 **/
public class ExceptionDemo {
    public static void main(String[] args) {
        int k = 0;
        try{
            int i = 5/k;
            PrintWriter writer = new PrintWriter("test.txt");

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("1");
//            return;
        }
        catch (RuntimeException e){
            System.out.println("2");
            return ;
        } finally{
            System.out.println("4");
        }
        System.out.println("5");

        Integer i = new Integer(1) ;
        Long m = new Long(1);

        if( i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}
