package org.genil.learning.java8.chap6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

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
        }catch (DateTimeParseException dateEx) { // It is a runtime exception
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
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime.of(23,59);

        System.out.println(" Getting second : "+localDateTime.getSecond());

        Period period = Period.of(0,0,0);

        System.out.println(" 000 Period : "+period);

        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(" date @ MAX time :: "+date.atTime(time));


        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));


        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate eventDate = LocalDate.of(2018, 1, 1);
        boolean flag1 = newYear.isAfter(eventDate);
        boolean flag2 = newYear.isBefore(eventDate);
        System.out.println(flag1 + ":" + flag2);


        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(" withDayOfYear: "+joiningDate.withDayOfYear(29));


        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse("1947-08-15",
                DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date3 = LocalDate.of(1947, 8, 15);

        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));

        date1 = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_DATE);

        date1 = date1.minusMonths(1);

        System.out.println(" - 1 months : "+date1);

        date1 = date1.minusDays(1);

        System.out.println(" -1 day : "+date1);


    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }
}
