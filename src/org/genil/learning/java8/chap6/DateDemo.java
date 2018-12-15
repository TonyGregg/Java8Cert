package org.genil.learning.java8.chap6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

/**
 * Created by genil on 12/14/18 at 05 27
 **/
public class DateDemo {
    public static void main(String[] args) {
//        String str = "01141988";
        String str = "07101980";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMddyyyy");

        LocalDate bDay = null;
        try {
            bDay = LocalDate.parse(str,dateTimeFormatter);
        }catch (DateTimeParseException dateEx) {
            System.out.println("Bad date Indy");
            return;
        }

        System.out.println("Your B'day is "+bDay);
        System.out.println("a "+bDay.getDayOfWeek());

        Period p1 = Period.between(bDay,LocalDate.now());
//        Period p1 = Period.between(LocalDate.now(),bDay);
        System.out.println("You lived for: ");
        System.out.print(p1.getDays() + " days, "+p1.getMonths()+ " months, "+p1.getYears() + " years \n");

        long tDays = bDay.until(LocalDate.now(),ChronoUnit.DAYS);
        System.out.println("You've lived for "+tDays+ " days, so far");

        System.out.println("You'll reach 30,0000 days on "+bDay.plusDays(30_000));

//        LocalDate localDate = LocalDate.of(2018, Month.FEBRUARY,31); // Runtime exception
//
//        System.out.println(localDate.getDayOfWeek());
//

    }
}
