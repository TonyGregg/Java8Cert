package org.genil.learning.java8.chap6;

import org.relaxng.datatype.DatatypeException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by genil on 12/14/18 at 13 54
 **/
public class NiceDates {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd,yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MMM dd,yyyy G");

        DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ISO_LOCAL_TIME;

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.format(f1));
        localDate.format(f1); //returns string too
        System.out.println(localDate.format(f2));

        f1.format(localDate); //returns string


    }

    {
        System.out.println("some");
    }



}
