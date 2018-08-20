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
    }
}