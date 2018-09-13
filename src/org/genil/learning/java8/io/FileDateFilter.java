package org.genil.learning.java8.io;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Antony on 8/18/18 at 06 26
 **/
public class FileDateFilter implements FilenameFilter
{
    private final String filterDateStr;
    private SimpleDateFormat simpleDateFormat;
    private static final String DATE_FORMAT = "yyyy-MM-dd";

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
}
