package org.genil.learning.java8.io;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by genil on 8/18/18 at 06 26
 **/
public class FileDateFilter implements FilenameFilter
{
    private final String filterDateStr;
    private SimpleDateFormat simpleDateFormat;
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String DASH = "-";
    private static final String FOLDER = "/Users/genil/Documents/temp";

    public FileDateFilter(String filterDateStr) {
        this.filterDateStr = filterDateStr;

        simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
    }

    @Override
    public boolean accept(File dir, String name) {
        Date date = new Date(new File(dir, name).lastModified());
        String current = simpleDateFormat.format(date);

        return filterDateStr.compareTo(current) == 0;

    }

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        System.out.println("Today's date "+today);



        System.out.printf("Year : %d Month : %d day : %d \t %n",today.getYear(),
                today.getMonthValue(), today.getDayOfMonth());

        String todayStr = today.getYear()+DASH
                +(today.getMonthValue()<10?"0"+today.getMonthValue():today.getMonthValue())+DASH+today.getDayOfMonth();

        String yesterdayStr = today.getYear()+DASH
                +(today.getMonthValue()<10?"0"+today.getMonthValue():today.getMonthValue())+DASH+(today.getDayOfMonth()-1);


        FileDateFilter todayFileFilter = new FileDateFilter(todayStr);

        FileDateFilter yesterdayFileFilter = new FileDateFilter(yesterdayStr);

        File folder = new File(FOLDER);
        File todayFiles[] = folder.listFiles(todayFileFilter);

//        System.out.println("File count "+todayFiles.length);

        File yesterdayFiles[] = folder.listFiles(yesterdayFileFilter);

        System.out.println("Todays file list. .");

        for ( File file : todayFiles) {
            System.out.println(file.getName() + " "+ file.lastModified());
        }

        System.out.println("Yesterdays file list");
        for ( File file : yesterdayFiles) {
            System.out.println(file.getName() + " "+ file.lastModified());
        }

    }

}
