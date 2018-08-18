package org.genil.learning.java8.io;

import java.io.File;
import java.time.LocalDateTime;

/**
 * Created by genil on 8/18/18 at 07 43
 **/
public class FileUtil {

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String DASH = "-";
    private static final String FOLDER = "/Users/genil/Documents/temp";
    private static final String ZERO = "0";

    /**
     *
     * @return the latest 2 modified files of [0] today's and [1] yesterdays
     *
     */
    public File[] getLatestLastTwoDaysFile(String directory) {
        /**
         * 1. Get dates : today and yesterday in string format
         */

        LocalDateTime today = LocalDateTime.now();

        String todayStr = today.getYear()+DASH
                +(today.getMonthValue()<10?ZERO+today.getMonthValue():today.getMonthValue())+DASH+today.getDayOfMonth();

        String yesterdayStr = today.getYear()+DASH
                +(today.getMonthValue()<10?ZERO+today.getMonthValue():today.getMonthValue())+ DASH
                +(today.getDayOfMonth()-1);

        //2. Use file filter to filter files based on dates

        FileDateFilter todayFileFilter = new FileDateFilter(todayStr);

        FileDateFilter yesterdayFileFilter = new FileDateFilter(yesterdayStr);

        File folder = new File(directory);
        File todayFiles[] = folder.listFiles(todayFileFilter);
        File yesterdayFiles[] = folder.listFiles(yesterdayFileFilter);

        //3. Get the latest modified file of today and yesterday

        File[] files = new File[2];
        files[0] = getLatestModifiedFile(todayFiles);
        files[1] = getLatestModifiedFile(yesterdayFiles);

        return files;


    }

    /**
     *
     * @param files
     * @return the last modified file from the list of files
     */
    private File getLatestModifiedFile(File[] files) {
        if(files == null || files.length ==0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for(int i=1; i<files.length; i++) {
            if(lastModifiedFile.lastModified()<files[i].lastModified()) {
                lastModifiedFile = files[1];
            }
        }
        return lastModifiedFile;
    }

    public static void main(String[] args) {
        // Test...
        FileUtil fileUtil = new FileUtil();

        File[] files = fileUtil.getLatestLastTwoDaysFile(FOLDER);

        System.out.println("Todays latest file : "+files[0] + "\nYesterday's : "+files[1]);
    }


}
