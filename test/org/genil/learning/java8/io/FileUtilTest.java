package org.genil.learning.java8.io;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by genil on 8/20/18 at 09 03
 **/
class FileUtilTest {
    private static final String FOLDER = "/Users/genil/Documents/temp";


    @Test
    void getLatestLastTwoDaysFile() {

        // Test...
        FileUtil fileUtil = new FileUtil();

        File[] files = fileUtil.getLatestLastTwoDaysFile(FOLDER);

        System.out.println("Todays latest file : "+files[0] + "\nYesterday's : "+files[1]);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1,");
        stringBuilder.append("2,");
        stringBuilder.append("3,");
        stringBuilder.append("4,");

        System.out.println(stringBuilder.toString());

        System.out.println(" -----");

        stringBuilder.setLength(stringBuilder.length()-1);

        System.out.println(stringBuilder);
    }
}